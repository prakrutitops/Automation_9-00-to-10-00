package com.a84;

import java.util.Iterator;
import java.util.Vector;


public class VectorEx2 
{
	public static void main(String[] args) 
	{
		
		Vector<String> v =new Vector<>(5);
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("C");
		v.add("D");
		v.add("C");
		v.add("D");
		v.add("C");
		v.add("D");
		v.add("D");
				
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		if(v.contains("D"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
}
