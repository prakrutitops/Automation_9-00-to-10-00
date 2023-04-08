package com.a84;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		list.addFirst("5");
		list.addLast("6");
		list.add(3, "13");
		
		System.out.println(list);
	}
}
