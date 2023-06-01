package coma16;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingEx 
{
	@Parameters("browser")
	@Test
	public void Test(String browser)
	{
		
			WebDriver driver = null;
		  
		  if(browser.equals("a")) 
		  {
			  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");		
			  driver = new ChromeDriver(); 
			  
		  }
			
		if(browser.equals("ff"))
		{
				System.setProperty("webdriver.gecko.driver","E:\\chromedriver\\geckodriver.exe");
				driver = new FirefoxDriver(); 
		}
			 
		 else 
		  {
			  System.out.println("Key Doesn't match with any command"); 
			  
		  }
		  
		  driver.get("https://www.facebook.com/");
		  
		 		
	}
	
}
