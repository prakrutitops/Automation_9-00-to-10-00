package com.a213;

class P //class
{
	void p() //method
	{
					//body part
		
			System.out.println("P executed");
		
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q executed");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R executed");
	}
}
class S extends R
{
	void s()
	{
		System.out.println("S Executed");
	}
}

public class MultilevelEx 
{
	
	public static void main(String[] args) 
	{
		S s =new S();//object
		
		s.p();
		s.q();
		s.r();
		s.s();
	
	}
	
}
