package com.a283;

public class StringEx5 
{
	public static void main(String[] args) 
	{
		
		//Literal String
		String s1 ="priyanka";
		
		String s2 ="sachin";
		
		String s3 ="priynk";
		
		String s4 ="SACHIN";
		
		//New Keyword String
		String s5 =new String("sachin");
		
		
		//comparision using Equals method - true,false
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));
		
		
		//Equals Ignore Case
		System.out.println("------------------------------------");
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//==
		System.out.println("------------------------------------");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s5);
		
		//CompareTo
		System.out.println("------------------------------------");
		
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s3));
		
		//Compare to Method will compare String using ASCII Value
	}
}
