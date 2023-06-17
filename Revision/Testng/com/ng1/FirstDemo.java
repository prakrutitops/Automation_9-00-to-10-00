package com.ng1;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo 
{
	@Test
	public void passtest()
	{
		System.out.println("This is Pass Test...");
	}
	@Test
	public void failtest()
	{
		System.out.println("This is Fail Test...");
		fail();
	}
	@Test
	public void skiptest()
	{
		System.out.println("This is Skip Test...");
		throw new SkipException("self skipped...");
	}
}