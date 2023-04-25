package Test.Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection 
{
	public static WebDriver tops(String url) throws InterruptedException
	{
		WebDriver driver =null;
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();//
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}
	
	
}
