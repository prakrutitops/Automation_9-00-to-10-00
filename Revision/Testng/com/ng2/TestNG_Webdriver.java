package com.ng2;

import static org.testng.Assert.fail;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Webdriver 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
	}
	@Test(priority = 0)
	public void signin() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void login() throws InterruptedException
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email=sc.nextLine();
		System.out.println("Enter password : ");
		String password=sc.nextLine();
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Login - My Store"))
		{
			System.out.println("This Test is Failed...");
			fail();
		}
		else
		{
			System.out.println("This test is passed..");
		}
	}
	@Test(priority = 2)
	public void signout() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}