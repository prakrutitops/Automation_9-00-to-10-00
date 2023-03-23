package com.a23;

public class StaticVariableEx 
{
	static int acccount =0;
	
	public StaticVariableEx()
	{
		// TODO Auto-generated constructor stub
		
		acccount++;
		System.out.println(acccount);
	}
	
	
	public static void main(String[] args) 
	{
		
		StaticVariableEx s1 =new StaticVariableEx();
		StaticVariableEx s2 =new StaticVariableEx();
		StaticVariableEx s3 =new StaticVariableEx();
		
	}
}
