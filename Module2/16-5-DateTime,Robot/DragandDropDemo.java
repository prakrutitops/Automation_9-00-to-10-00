package com.b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
