package com.ng2;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider 
{
	
	WebDriver driver=null;
	
	@DataProvider(name="rahul")
	public Object[][] input()
	{
		return new Object[][] {{"pranav","1234"},{"rahul.san@gmail.com","rah345"}};
	}
	
	@Test(dataProvider = "rahul")
	public void login(String email,String pass) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		
	
		
		
		
		  driver.findElement(By.linkText("Log in")).click();
		  
		  Thread.sleep(2000);
		  
		 driver.findElement(By.id("loginusername")).sendKeys(email);
		  Thread.sleep(1000);
		  
		  
		driver.findElement(By.id("loginpassword")).sendKeys(pass);
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath(
		  "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		  Thread.sleep(3000);
		 
		
		  
		  
		  //Thread.sleep(5000);
		  
		  
		  if(driver.getCurrentUrl().equals("https://www.demoblaze.com/"))
		  {
			  Thread.sleep(2000);
			  driver.findElement(By.linkText("Log out")).click();
		  }
		  else
		  {
			  System.out.println("Error");
			  fail();
		  }
		  
		 
		  
		  
	
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
}
