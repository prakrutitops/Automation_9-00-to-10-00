import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class LoginPArameters 
{
	
	
	String username;
	String password;
	static WebDriver driver;
	
	public LoginPArameters(String username,String password)
	{
		// TODO Auto-generated constructor stub
		
		this.username = username;
		this.password=password;
		
	}
	
	//1. 
	@BeforeClass
	public  static void openweb()
	{
		driver= DriverConnction.getconnection("https://www.facebook.com/");
	}
	
	//2.
	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(2000);
		
		WebElement uname =  driver.findElement(By.id("email"));
		uname.clear();
		uname.sendKeys(username);
		
		Thread.sleep(2000);
		
		WebElement pass =  driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
		
		Thread.sleep(2000);
		
	}
	
	//3.
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "abc@gmail.com";
		obj[0][1] = "abc";
		
		
		obj[1][0] = "xyz@gmail.com";
		obj[1][1] = "xyz";
		
		
		obj[2][0] = "tops@gmail.com";
		obj[2][1] = "tops";
		
		
		obj[3][0] = "tech@gmail.com";
		obj[3][1] = "tech";
		
		return Arrays.asList(obj);
	
	}
	
	
	
	
	
	
	
	
	
	
}
