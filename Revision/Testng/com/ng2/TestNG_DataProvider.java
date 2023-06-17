package com.ng2;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_DataProvider 
{
	WebDriver driver=null;

	@DataProvider(name="rahul")
	public Object[][] input()
	{
		return new Object[][] {{"rahul.sanghavi.mca@gmail.com","rahul12345"},{"rahul.san@gmail.com","rah345"}};
	}
	@Test(dataProvider = "rahul")
	public void login(String email,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
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

		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(2000);
		driver.close();
	}
}