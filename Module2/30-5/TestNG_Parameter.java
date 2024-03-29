package com.ng2;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter 
{
	
	WebDriver driver=null;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(3000);
		
		login("6359074267", "6359074267");
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
	@Test
	//@Parameters({"user_name","user_password"})
	public void login(String email,String password) throws InterruptedException
	{
	
		driver.findElement(By.name("user_name")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(3000);
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
}
