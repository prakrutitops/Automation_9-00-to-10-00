package com.a213;


class A1
{
	void a1()
	{
		System.out.println("A1 Executed");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("B1 Executed");
	}
}
interface C1 
{
	void c1();
}
class D1 extends B1 implements C1 
{
	void d1()
	{
		System.out.println("D1 Executed");
	}

	@Override
	public void c1() 
	{
		// TODO Auto-generated method stub
		System.out.println("C1 Executed");
	}
}


public class HybridEx 
{
	public static void main(String[] args)
	{
		D1 d =new D1();
		
		d.a1();
		d.b1();
		d.c1();
		d.d1();
	}
}
