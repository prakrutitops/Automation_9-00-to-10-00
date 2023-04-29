

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_MouseEvent 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		
		WebElement flights=driver.findElement(By.linkText("Flights"));
		
		WebElement cruise=driver.findElement(By.linkText("Cruises"));
		
		
		
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(home).build();//to make event 
		a1.perform();
		
		
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flights).build();//to make event 
		a2.perform();
		
		
		Action a3=actions.moveToElement(cruise).build();//to make event 
		a3.perform();
	}
}
