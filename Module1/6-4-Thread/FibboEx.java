package com.a64;

import java.util.Scanner;

public class FibboEx 
{
	static int num1=0;
	static int num2=1;
	static int a=0;
	static int num=0;
	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		num = sc.nextInt();
		
		while(num>0)
		{
			System.out.println(a);
			a =num1+num2;
			num1=num2;
			num2=a;
			num--;
		}
		
		
		
	}
}
