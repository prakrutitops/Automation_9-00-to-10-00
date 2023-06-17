package com.ng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AllAnnotationDemo 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite...");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite...");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class...");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class...");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test...");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test...");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method...");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method...");
	}
	@Test
	public void test()
	{
		System.out.println("This is Main Test....");
	}
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("This is Main Test1....");
	}
}
