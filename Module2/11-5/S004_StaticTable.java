package a;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S004_StaticTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(3000);
		
		
		List<WebElement>  rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		
		List<WebElement> header =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(int i=1;i<=header.size();i++)
		{
			String data =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th["+i+"]")).getText();
			System.out.print(data+" ");
		}
		System.out.println();
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement>  cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		 
		driver.quit();
	}
}
