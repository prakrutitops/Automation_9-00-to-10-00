package a;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class S005_dynamicTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(3000);
		
		
		
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}
