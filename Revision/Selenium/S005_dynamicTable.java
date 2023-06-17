package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnction;

public class S005_dynamicTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnction.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}
