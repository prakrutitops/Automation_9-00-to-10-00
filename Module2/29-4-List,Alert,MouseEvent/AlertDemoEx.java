

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoEx 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		//WebDriver driver = DriverConnction.getconnection("https://demo.guru99.com/test/delete_customer.php");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(1000);
		
		
		
		Alert a1 = driver.switchTo().alert();
		System.out.println("Alert Message 1.. "+a1.getText());
		a1.dismiss();
		
		
		Thread.sleep(1000);
		
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
}
