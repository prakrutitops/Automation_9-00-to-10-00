import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		//Key,Value Pair
		//Set the path for chrome driver
		
		//chromedriver
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		
		//classname objname = new classname();
		WebDriver driver = new ChromeDriver();//
		
		//URL- Link
		driver.get("https://www.facebook.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//set timer for 3 seconds
		Thread.sleep(3000);
		
		
		//driver.quit();
		driver.close();
	}
}
