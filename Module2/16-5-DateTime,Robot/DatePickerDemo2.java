package com.b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		Thread.sleep(3000);
		
		
		WebElement d1=driver.findElement(By.cssSelector("span.k-icon.k-i-calendar.k-button-icon"));
		d1.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("8")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
