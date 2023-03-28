package com.a283;

public class StringEx7 
{
	
	//Mutable
	public static void main(String[] args) 
	{
		
		
		
		StringBuffer sf =new StringBuffer("Hello");
		
		//Append
		/*
		 * sf.append(" Java");
		 * 
		 * System.out.println(sf);
		 */
		
		
		//Insert
		/*
		 * sf.insert(1, "Java");//HJavaello
		 * 
		 * System.out.println(sf);
		 */
		
		
		//Delete
		/*
		 * sf.delete(1, 3);//Hlo System.out.println(sf);
		 */
		
		/*
		 * sf.replace(1, 3, "Java");//HJavalo System.out.println(sf);
		 */
		
		sf.reverse();
		System.out.println(sf);
	}
}
