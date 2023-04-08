package com.a84;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		
		HashSet h1 =new HashSet<>();
		
		h1.add("1");
		h1.add("2");
		h1.add("3");
		h1.add("4");
		h1.add("3");
		h1.add("4");
		
		System.out.println(h1);
		
		Iterator i = h1.iterator();
		
		
		while(i.hasNext()) //Loop
		{
			System.out.println(i.next());
		}
	}
}
