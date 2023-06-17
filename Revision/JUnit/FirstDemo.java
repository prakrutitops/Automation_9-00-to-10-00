package com.unit1;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo 
{
	@Test
	public void passTest()
	{
		System.out.println("This is First Passed Junit Test...");
	}
	@Test
	public void failTest()
	{
		System.out.println("This is First Failed Junit Test...");
		fail();
	}
}
