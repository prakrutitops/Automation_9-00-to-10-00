package dependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependeyTest2 
{
	
		WebDriver driver = null;
		
		@Test
		public void beforetest() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.get("https://www.demoblaze.com/");
			Thread.sleep(3000);
		}
	
		
		@Test(dependsOnMethods = "beforetest")
		public void signin() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			
		}
		
		@Test(dependsOnMethods = "signin")
		public void login() throws InterruptedException
		{
			driver.findElement(By.id("loginusername")).sendKeys("pranav");
			Thread.sleep(3000);
			driver.findElement(By.id("loginpassword")).sendKeys("1234");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
			Thread.sleep(3000);
		}
	
}
