package Selenium.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_FbSignupDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement a = driver.findElement(By.name("email"));
		a.sendKeys("a@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement b = driver.findElement(By.name("pass"));
		b.sendKeys("1234");
		
		
		
		
		
	}
}
