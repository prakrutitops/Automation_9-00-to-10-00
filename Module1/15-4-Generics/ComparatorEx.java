package com.a154;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2
{
	int id;
	String name;
	int age;
	
	public Student2(int id,String name,int age) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator implements Comparator
{
	
	
	@Override
	public int compare(Object o1, Object o2) 
	{
		// TODO Auto-generated method stub
	
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		
		if(s1.age==s2.age) 
		{
			return 0; 
			
		} 
		else if(s1.age>s2.age) 
		{
			return 1; 
		} 
		else 
		{
			 return -1; 
			 
		}
	}

		
		
	
	
}
class NameComparator implements Comparator
{  
public int compare(Object o1,Object o2)
{  
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
  
	return s1.name.compareTo(s2.name);  
}  
}  






public class ComparatorEx 
{
	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();  
		al.add(new Student2(101,"Vijay",23));  
		al.add(new Student2(106,"Ajay",27));  
		al.add(new Student2(105,"Jai",21));  
		
		try
		{
			
			  System.out.println("Sorting by name");
			  
			  
			  Collections.sort(al,new NameComparator());
			  
			  //-1.---------------
			  Iterator i = al.iterator(); while(i.hasNext())
			  { 
				  Student2 st=(Student2)i.next();
				  System.out.println(st.id+" "+st.name+" "+st.age); 
			  }
			 
			
			
			System.out.println("Sorting by age");
			
			
			//-2.---------------------------
			Collections.sort(al,new AgeComparator());
			
			
			
			Iterator i2 = al.iterator();
			while(i2.hasNext())
			{
				Student2 st2=(Student2)i2.next();  
				System.out.println(st2.id+" "+st2.name+" "+st2.age);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
