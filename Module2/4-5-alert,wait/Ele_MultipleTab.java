

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_MultipleTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		String mainw=driver.getWindowHandle();
		System.out.println("Mainw is.. "+mainw);
		
		Set<String> allw=driver.getWindowHandles();
		
		Iterator<String> i1=allw.iterator();
		while(i1.hasNext())
		{
			String childw=i1.next();
			System.out.println("Childw is.. "+childw);
			
			if(!mainw.equals(childw))
			{
				driver.switchTo().window(childw);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("prakruti.vyas@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(mainw);
		System.out.println("MAinW title is.. "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
