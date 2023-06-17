package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnction;

public class S009_MultiplewindowHandling {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnction.getconnection("http://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		//System.out.println(mainWin);
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwins =  driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			} 
		}
		
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
	}
}
