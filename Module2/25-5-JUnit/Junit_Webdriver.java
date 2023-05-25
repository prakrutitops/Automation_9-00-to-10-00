import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver 
{
	
	WebDriver driver = null;
	
	
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();;
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("pranav");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
		if(driver.getCurrentUrl().equals("https://www.demoblaze.com/"))
		{
			System.out.println("Your Login Test hasbeen passed...");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Log out")).click();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("Your Login Test hasbeen Failed...");
			fail();
		}
		
	}
	/*
	 * @After public void after() throws InterruptedException {
	 * 
	 * }
	 */
	
	
}
