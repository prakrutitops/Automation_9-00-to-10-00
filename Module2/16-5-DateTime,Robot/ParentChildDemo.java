package com.b;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildDemo 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
		//-------------Parent Child---------------------------------
		/*
		 * driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).
		 * sendKeys("Tops Technologies");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * driver.findElement(By.name("btnK")).click(); Thread.sleep(2000);
		 */
		
		
		//------------------Robot Class Demo ---------------------------------
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("identifier")).sendKeys("prakruti.tops@gmail.com");
		
		Thread.sleep(2000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}
}
