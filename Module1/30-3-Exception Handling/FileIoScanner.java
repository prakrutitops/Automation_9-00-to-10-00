package com.a303;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIoScanner 
{
	public static void main(String[] args) throws IOException 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Surname");
		String surname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		
		String myname="\n Your Name is: ";
		String mysurname="\n Your Surname is: ";
		String myemail="\n Your Email is: ";
		
		FileOutputStream fout =new FileOutputStream("E://tops.txt");
		fout.write(myname.getBytes());
		fout.write(name.getBytes());
		
		fout.write(mysurname.getBytes());
		fout.write(surname.getBytes());
		
		fout.write(myemail.getBytes());
		fout.write(email.getBytes());
		
		System.out.println("Success");
		
	}
}
