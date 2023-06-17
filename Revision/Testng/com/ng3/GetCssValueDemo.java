package com.ng3;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeClass;

public class GetCssValueDemo 
{
	WebDriver driver=null;
	private By bysearchbutton=By.name("btnK");
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public void button_color_test() 
	{
		WebElement searchbutton=driver.findElement(bysearchbutton);
		System.out.println("Before Mouse Button color is.. "+searchbutton.getCssValue("color"));
		String sss=searchbutton.getCssValue("color");
		System.out.println("Hexa color code is... "+ Color.fromString(sss).asHex());
	}
	@Test(priority = 1)
	public void button_fontsize_test() 
	{
		WebElement searchbutton=driver.findElement(bysearchbutton);
		System.out.println("Font Size is... "+ searchbutton.getCssValue("font-size"));
	}
	@Test(priority = 1)
	public void button_backgroundcolor_test() 
	{
		WebElement searchbutton=driver.findElement(bysearchbutton);
		System.out.println("BackGround Color is... "+ Color.fromString(searchbutton.getCssValue("background-color")).asHex());
		
	}
}
