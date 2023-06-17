package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnction;

public class s006_webtable {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/webtables");
		String name = "Kierradddsf";
		
		
		try {
			WebElement text = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			if(text.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
			}
			
		} catch (Exception e) {
			System.out.println("Not found");
		}
		
		
	}
}
