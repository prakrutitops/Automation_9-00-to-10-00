package com.a163;

import java.util.Scanner;

public class SwitchEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Number");
		int number = sc.nextInt();
		
		switch(number)
		{
			case 1: System.out.println("Your Selected Language is English");
			break;
			
			case 2: System.out.println("Your Selected Language is Hindi");
			break;
			
			case 3:System.out.println("Your Selected Language is Gujarati");
			break;
			
			default:System.out.println("Your Number is Not Valid");
			break;
		}
	
		
		
		
	}
}
