package com.a213;

interface X
{
	void x1();
}
interface Y
{
	void y1();
}
class Z implements X,Y
{

	@Override
	public void y1() {
		// TODO Auto-generated method stub
		System.out.println("Y1 Executed");
	}

	@Override
	public void x1() {
		// TODO Auto-generated method stub
		System.out.println("X1 Executed");
	}
	
}

public class MultipleEx 
{
	public static void main(String[] args) {
		
		
		Z z =new Z();
		
		z.x1();
		z.y1();
		
	}
}
