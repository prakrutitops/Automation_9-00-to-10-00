package Selenium.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S003_Practice_Form 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/automation-practice-form");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("prakruti");
		
		
		//driver.close();
		
		
	}
}
