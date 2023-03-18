package com.a183;

public class StudentEx 
{
	//variable declaration,Data Memeber Declaration
	int id;
	String name;
	
	
	public static void main(String[] args) 
	{
		
		//classname objname = new classname();
		
		StudentEx s1 = new StudentEx();
		
		StudentEx s2 =new StudentEx();
		
		
		//Assign the value in Object 
		
		s1.id=101;
		s1.name="Dhaval";
		
		s2.id=102;
		s2.name="Mihir";
		
		
		//Print Value From Object
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
		
	}
}
