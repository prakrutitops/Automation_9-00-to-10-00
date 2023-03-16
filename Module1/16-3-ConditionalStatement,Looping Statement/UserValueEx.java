package com.a163;

import java.util.Scanner;

public class UserValueEx 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your First Name");
		String fname = sc.next();
		
		System.out.println("Enter Your Last Name");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		System.out.println("\n Your FirstName is :"+fname+" \n Your LastName is:"+lname+" \n Your Email is:"+email+" \n Your Password is:"+pass);
		
		//System.out.println("\t "+fname+" \t "+lname+" \t "+email+" \t "+pass);
		
	}
}
