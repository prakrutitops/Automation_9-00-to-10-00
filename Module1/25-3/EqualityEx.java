package com.a253;

public class EqualityEx 
{
	public static void main(String[] args) 
	{
		
		String s1 ="sachin";
		String s2="sachin";
		String s3="SACHIN";
		String s4="Ratan";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
	}
}
