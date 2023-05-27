package com.ng1;

import org.testng.annotations.Test;

public class SecondDemo 
{
	@Test(priority = 2)
	public void test()
	{
		System.out.println("This is Main Test...");
	}
	@Test(priority = 1)
	public void Test()
	{
		System.out.println("This is Main Test2...");
	}
	
	@Test(priority = 3)
	public void Aest()
	{
		System.out.println("This is Main Aest...");
	}
	@Test(priority = 0)
	public void zest()
	{
		System.out.println("This is Main zest...");
	}
	
}
