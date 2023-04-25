package Test.Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S002_FbSignupDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("prakruti");
		
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("vyas");
		
		Thread.sleep(1000);
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("vyas.prakruti@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement mob2 = driver.findElement(By.name("reg_email_confirmation__"));
		mob2.sendKeys("vyas.prakruti@gmail.com");
	
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("Tops@123456");
		
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("1");
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("Aug");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(13);
		
		Thread.sleep(1000);
		
		List<WebElement>list = driver.findElements(By.name("sex"));
		list.get(0).click();
		
		Thread.sleep(1000);
		
		WebElement Signupbtn = driver.findElement(By.name("websubmit"));
		Signupbtn.click();
		
		Thread.sleep(1000);
		
		
	}
}
