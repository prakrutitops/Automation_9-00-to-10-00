package com.b;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		
		element.sendKeys("08102022");
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		element.sendKeys("0915AM");
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
