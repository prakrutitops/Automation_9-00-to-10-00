package com.a283;

public class StringEx6 
{
	public static void main(String[] args) 
	{
		
		String s1 ="  sachin  ";
		String s2 ="sachin";
		
		String s3 ="tops";
		String s4 ="TOPS";
		
		String s5 ="PHP is a programming language,PHP is Following OOP Concepts .PHP having a more demand";
		
		System.out.println(s1.trim());
		System.out.println(s2.startsWith("sa"));
		System.out.println(s2.endsWith("n"));
		System.out.println(s2.charAt(0));
	
	
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		System.out.println(s5.replaceAll("PHP", "JAVA"));
		
	
	}
}
