package com.a303;

public class ThrowEx 
{
	
	static void validate(int age) 
	{
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			throw new ArithmeticException("Not Eligible to Vote");
			//throw new MyExceptionEx();
		}
	}
	
	public static void main(String[] args) 
	{
		validate(17);
	}
}
