package com.a185;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablehtml 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("file://E:\\Myhtml\\index2.html");
		Thread.sleep(3000);
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;i++)
			{
				
				if(i==1)
				{
					String value =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText();
					System.out.println("  "+value);
					Thread.sleep(3000);
				}
				else
				{
					String value =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println("  "+value);
					Thread.sleep(3000);
					
				}
				
			}
			System.out.println();
			Thread.sleep(3000);
		}
		
	}
}
