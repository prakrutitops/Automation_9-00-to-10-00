package com.unit2;

import org.junit.Before;
import org.junit.Test;

public class Junit_Exception 
{
	Arithmatic a1=null;
	@Before
	public void before()
	{
		a1=new Arithmatic();
	}
	@Test(expected = ArithmeticException.class)
	public void test()
	{
		a1.divide(10, 0);
	}
}
