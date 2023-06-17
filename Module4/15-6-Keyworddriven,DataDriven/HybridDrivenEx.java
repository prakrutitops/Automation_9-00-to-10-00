package com.a176;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class HybridDrivenEx 
{
	@DataProvider(name = "tops")
	public static Object[][] readexcel() throws InvalidFormatException, IOException
	{
		Object[][] data=null;
		
			
		String filepath="E:\\photos\\login.xlsx"; //only string form path
		
		File file=new File(filepath); //to make an file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet3");//to open the particular sheet
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		
		data=new Object[nrows][];
		
		for(int i=0;i<nrows;i++)//row
		{
			
			Row row=sheet.getRow(i);//ith row is selection
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			
			data[i]=new Object[ncols];
			
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
	@Test(dataProvider = "tops")
	public void test(String keyword,String data) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		if(keyword.equals("open browser"))
		{
			driver=new ChromeDriver();//to load the blank browser
		}
		else if(keyword.equals("enter url"))
		{
			driver.get(data);	
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("user-name")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.id("password")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click login"))
		{
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Your Test HasBeen Passed...");
			}
			else
			{
				System.out.println("Your Test Has beenFailed");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\screenshot\\1.png");
				FileUtils.copyFile(src, dest);
				Thread.sleep(2000);
				Assert.fail("Incorrect username or password...");
				
			}
		}
			
			else if(keyword.equals("click sidemenu"))
			{
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(2000);
			}
			else if(keyword.equals("click logout"))
			{
				driver.findElement(By.id("logout_sidebar_link")).click();
				Thread.sleep(2000);
			}
			else if(keyword.equals("close browser"))
			{
				System.out.println("Bye Bye...");
				driver.close();
			}
		}
		
		
		
		
	}
	
	

