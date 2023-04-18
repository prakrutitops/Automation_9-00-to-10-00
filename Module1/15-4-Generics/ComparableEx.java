package com.a154;

import java.util.ArrayList;
import java.util.Collections;

//two diffrent object
class Student implements Comparable<Student>
{

	//Data Memebers
	int rollno;  
	String name;  
	int age;  
	
	
	//Parameterized constructor
	public Student(int rollno,String name,int age) 
	{
		// TODO Auto-generated constructor stub
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}


	@Override
	public int compareTo(Student a1) 
	{
		// TODO Auto-generated method stub
		
		
		if(age == a1.age)
		{
			return 0;
		}
		else if(age>a1.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
}


public class ComparableEx 
{
	public static void main(String[] args)
	{
		ArrayList<Student> arrayList =new ArrayList<>();
		arrayList.add(new Student(101,"Mihir",22));
		arrayList.add(new Student(102,"Ajay",20));
		arrayList.add(new Student(103,"Vijay",25));
		
		
		Collections.sort(arrayList);
		
		for(Student s1 :arrayList)
		{
			System.out.println(s1.rollno+" "+s1.name+" "+s1.age);
		}
		
		
		
		
	}
}
