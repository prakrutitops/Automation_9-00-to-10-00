package com.ng2;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Dependence 
{
	WebDriver driver=null;
	@Test
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods = {"beforetest"})
	public void signin() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"signin"})
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("rahul.sanghavi.mca@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("rahul12345");
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
	@Test(dependsOnMethods = {"login"})
	public void signout() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"signout"})
	public void aftertest()
	{
		driver.close();
	}
}
