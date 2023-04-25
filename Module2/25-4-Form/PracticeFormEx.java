package Test.Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String day = "25";
		String month ="August";
		String year = "2000";
		
		
		 WebDriver driver = DriverConnection.tops("https://demoqa.com/automation-practice-form");
		
		 driver.findElement(By.id("firstName")).sendKeys("tops");
		 driver.findElement(By.id("lastName")).sendKeys("tech");
		 driver.findElement(By.id("userEmail")).sendKeys("tops@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		 driver.findElement(By.id("userNumber")).sendKeys("9724004242");
		 driver.findElement(By.id("dateOfBirthInput")).click();
		 
		 //react-datepicker__month-select -month
		 //react-datepicker__year-select  -year
		 
		 WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		 
		 Select m = new Select(mymonth);
		 m.selectByVisibleText(month);
			
		 
		 WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		 Select m2 = new Select(myyear);
		 m2.selectByVisibleText(year);
		 
		 List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		 
		 
		 for(WebElement e: days) 
		 {
			 if(e.getText().equals(day))
			 {
				 if(e.getAttribute("aria-label").contains(month))
				{
						e.click();
						break;
				}
			 }
		 }
		 
		 
		 
	}
}
