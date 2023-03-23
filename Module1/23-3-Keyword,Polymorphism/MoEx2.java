package com.a23;

public class MoEx2 
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	
	static double cal(float a,float b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(cal(2, 3));
		System.out.println(cal(2.0F, 3.0F));
	}
}
