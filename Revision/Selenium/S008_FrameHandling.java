package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverConnction;

public class S008_FrameHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/frames");
		
		
		//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		
		WebElement myframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(myframe);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
	}
}
