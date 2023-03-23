package com.a23;


//Global and Local Variable

public class ThisKeywordEx 
{
	//Global Variable
	int id;
	String name;
	
	
	public ThisKeywordEx(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		ThisKeywordEx t1 =new ThisKeywordEx(101,"Mihir");
		ThisKeywordEx t2 =new ThisKeywordEx(102,"Dhaval");
		
		t1.display();
		t2.display();
		
		
		
	}
}
