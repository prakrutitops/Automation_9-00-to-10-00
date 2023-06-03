package eshop;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeEx 
{
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("running login test");
		assertFalse(true);
	}
	
	@Test
	public void logout()
	{
		System.out.println("running logout test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method ...");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method ...");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class ...");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class ...");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test ...");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test...");
	}
	
}
