package com.a143;

public class LogicalOpEx 
{
	public static void main(String[] args) 
	{
		
		boolean a= true;
		boolean b=false;
		boolean c=true;
		
		
		System.out.println(a&&b);//wrong
		System.out.println(a&&c);//right
		
		System.out.println(a||b);
		System.out.println(a||c);
		
		System.out.println(!(a&&b));
		System.out.println(!(a&&c));
		
		
		
	}
}
