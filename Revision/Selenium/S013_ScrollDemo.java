package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnction;

public class S013_ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnction.getconnection("https://www.facebook.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele  =driver.findElement(By.linkText("Watch"));
		
		//js.executeScript("window.scrollBy(0,50)");
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
