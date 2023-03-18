package com.a183;

import java.util.Scanner;

public class ParaEx 
{
	int id;
	String name;
	String surname;
	String email;
	String password;
	
	public ParaEx(int i,String n,String s,String e,String p) 
	{
		// TODO Auto-generated constructor stub
		id=i;
		name =n;
		surname=s;
		email=e;
		password=p;
		
	}	
	
	void display()
	{
		System.out.println(id+" "+name+" "+surname+" "+email+" "+password);
		
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enetr Your ID");
		int id = sc.nextInt();
		
		System.out.println("Enetr Your Name");
		String name = sc.next();
		
		System.out.println("Enetr Your Surname");
		String surname = sc.next();
		
		System.out.println("Enetr Your Email");
		String email = sc.next();
		
		System.out.println("Enetr Your Password");
		String pass = sc.next();
		
		ParaEx p1 =new ParaEx(id,name,surname,email,pass);
		
		
		
		p1.display();
		
		
		
		
		/*
		 * System.out.println(p1.id+" "+p1.name); System.out.println(p2.id+" "+p2.name);
		 */
		
		
		
		
	}
	
}
