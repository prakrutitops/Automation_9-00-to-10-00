package com.unit1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllAnnotation 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class..");
	}
	@Before
	public void before()
	{
		System.out.println("Before Test..");
	}
	@Test
	public void test()
	{
		System.out.println("This is Main Test...");
	}
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("This is Main Test1...");
	}
	@After
	public void after()
	{
		System.out.println("After Test..");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class..");
	}
}
