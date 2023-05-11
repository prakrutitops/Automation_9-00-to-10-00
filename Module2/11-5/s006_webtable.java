package a;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class s006_webtable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(3000);
		
		
		String name = "Cierra";
		
		
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
