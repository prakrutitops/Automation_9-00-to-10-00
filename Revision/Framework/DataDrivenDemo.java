package com.fw;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenDemo 
{
	@Test
	public static String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
			
		String filepath="D:\\selenium morning\\login.xlsx"; //only string form path
		
		File file=new File(filepath); //to make an file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet1");//to open the perticular sheet
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		
		data=new String[nrows][];
		for(int i=0;i<nrows;i++)//row
		{
			Row row=sheet.getRow(i);//ith row is selection
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)//cols
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium morning\\chromedriver_win32 (1)\\chromedriver.exe");//build up path
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();//to load the blank browser
			driver.get("https://www.saucedemo.com/");	
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Your Test HasBeen Passed...");
			}
			else
			{
				System.out.println("Your Test HasbeenFailed");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\screenshot\\1.png");
				FileUtils.copyFile(src, dest);
				Thread.sleep(2000);
				Assert.fail("Incorrect username or password...");
			}
			Thread.sleep(2000);
			System.out.println("Bye Bye...");
			driver.close();
		}
	}
}
