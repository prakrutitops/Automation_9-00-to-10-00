package a;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class S008_FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		
		
		
		
		//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		
		WebElement myframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(myframe);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
	}
}
