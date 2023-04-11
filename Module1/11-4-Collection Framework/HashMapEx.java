package com.a84;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer>map =new HashMap<>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
		
	}
	
}
