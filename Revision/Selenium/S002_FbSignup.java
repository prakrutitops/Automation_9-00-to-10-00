package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S002_FbSignup {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("tops");
		
		WebElement day =  driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("19");
		
		WebElement month =  driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("3");
		
		WebElement year =  driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(3);
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
	}
}
