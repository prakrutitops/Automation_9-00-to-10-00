

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_List 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		
		
		Select s1=new Select(driver.findElement(By.id("fruits")));
		
		s1.selectByIndex(0);
		Thread.sleep(2000);
		
		s1.selectByValue("orange");
		Thread.sleep(2000);
		
		
		 s1.selectByVisibleText("Grape");
		 Thread.sleep(2000);
		 
		
		driver.close();
		
	}
}
