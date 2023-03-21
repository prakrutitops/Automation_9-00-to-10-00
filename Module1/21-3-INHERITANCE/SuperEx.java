package com.a213;

class MyColor
{
	String color="black";
}
class MyColor2 extends MyColor
{
	String color ="white";
	
	void print()
	{
		System.out.println(color);//current class value
		System.out.println(super.color);//parent class value
	}
}

public class SuperEx 
{
	public static void main(String[] args) {
		
		MyColor2 m =new MyColor2();
		
		m.print();
		
	}
}
