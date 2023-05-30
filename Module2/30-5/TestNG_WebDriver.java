package com.ng2;

import static org.testng.Assert.fail;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_WebDriver 
{
	WebDriver driver = null;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void test() throws InterruptedException
	{
		System.out.println("Before: "+driver.getCurrentUrl());
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Mobile:");
		String mob = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String pass = sc.nextLine();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("user_name")).sendKeys(mob);
		Thread.sleep(1000);
		
		driver.findElement(By.name("user_password")).sendKeys(pass);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(1000);
		
	
		System.out.println("After: "+driver.getCurrentUrl());
	
		
		  if(driver.getCurrentUrl().equals("https://careercenter.tops-int.com/")) 
		  {
			  System.out.println("Test Fail"); 
			  fail(); 
		  } 
		  else 
		  {
			  System.out.println("Test Pass"); 
		  }
		 
	}
	
	@Test(priority = 1)
	public void test1() throws InterruptedException
	{
		
		driver.findElement(By.name("keyword")).sendKeys("automation");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/section[2]/div[1]/form/div[3]/input")).click();
		Thread.sleep(1000);
		
		
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	
	
}
