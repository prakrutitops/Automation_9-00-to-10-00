package com.a84;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	
	//add
	//addAll
	//remove
	//removeAll
	//retainAll
	
	
	public static void main(String[] args) 
	{
		//dynamically
		ArrayList<String>arrayList =new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		
		
		ArrayList<String>arrayList2 =new ArrayList<>();
		
		arrayList2.add("P");
		arrayList2.add("Q");
		arrayList2.add("R");
		arrayList2.add("S");
		arrayList2.add("B");
		arrayList2.add("C");
		arrayList2.add("D");
		
		//System.out.println(arrayList);
		
		/*
		 * arrayList.addAll(arrayList2);
		 * 
		 * arrayList.remove(1); arrayList.removeAll(arrayList2);
		 */
		
		arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		
		while(i.hasNext()) //Loop
		{
			System.out.println(i.next());
		}
		
	}
}
