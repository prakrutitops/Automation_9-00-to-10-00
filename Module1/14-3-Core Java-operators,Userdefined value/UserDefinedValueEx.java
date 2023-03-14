package com.a143;

import java.util.Scanner;

public class UserDefinedValueEx 
{
	
	public static void main(String[] args) 
	{
	
		//Scanner Object
		//classname objname = new classname();
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your marks");
		double marks = sc.nextDouble();
		
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		/*
		 * System.out.println(id); System.out.println(name); System.out.println(salary);
		 */		
	}
	
}
