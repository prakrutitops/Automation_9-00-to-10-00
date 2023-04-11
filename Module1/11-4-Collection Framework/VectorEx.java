package com.a84;

import java.util.Iterator;
import java.util.Vector;


//add
//addAll
//remove
//removeAll
//retainAll


public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector<String> v =new Vector<>();
		
		v.add("Android");
		v.add("Java");
		v.add("Testing");
		
		
		
		Vector<String> v2 =new Vector<>();
		
		v2.add("Flutter");
		v2.add("SQL");
		v2.add("C,C++");
		v2.add("Testing");
		
		//System.out.println(v);
		
		/*
		 * v.addAll(v2); v.remove(1); v.removeAll(v2);
		 */
		
		v.retainAll(v2);
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}
}
