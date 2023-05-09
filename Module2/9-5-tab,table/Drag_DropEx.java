package com.a95;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropEx 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		 
		 
		/*
		 * WebElement from1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		 * WebElement to1 = driver.findElement(By.id("trash"));
		 */
	
		 for(int i=1;i<=2;i++)
		 {
			 WebElement from=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li["+i+"]")); 
			 WebElement to = driver.findElement(By.id("trash"));
			 
				
				Actions builder = new Actions(driver);
				
				 for(int j=1;j<=2;i++)
				 {
					 Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
					 dd.perform();
				 }
			 
					Thread.sleep(5000);
					driver.quit();
		 }
		 
	
		
		
	
		
		
		
		
	}
}
