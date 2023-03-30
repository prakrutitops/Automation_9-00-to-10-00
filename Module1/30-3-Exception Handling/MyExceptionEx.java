package com.a303;

public class MyExceptionEx extends Exception
{
	static void error()
	{
		System.out.println("Error Generated");
	}
	public static void main(String[] args) {
		
		error();
		
	}
}
