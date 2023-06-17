package com.unit2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver 
{
	WebDriver driver=null;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("rahul.sanghavi.mca@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("rahul12345");
		Thread.sleep(2000);
		driver.findElement(By.name("SubmitLogin")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"))
		{
			System.out.println("Your Login Test hasbeen passed...");
		}
		else
		{
			System.out.println("Your Login Test hasbeen Failed...");
			fail();
		}
	}
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
