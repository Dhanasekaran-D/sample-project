package com.java.dhanasekaran;

import java.util.Scanner;

class Employee {
	static int Empid;
	static String Empname;
	static char age;
	static float Empsalary;
	static long phno;

	public static void main(String args[])// throws IOException
	{
		Scanner empid = new Scanner(System.in);
		System.out.println("Enter the emp id=");
		Empid = empid.nextInt();

		Scanner empname = new Scanner(System.in);
		System.out.println("Enter the Emp name is");
		Empname = empname.next();

		Scanner Age = new Scanner(System.in);
		System.out.println("Enter your age ");
		age = Age.next().charAt(0);

		Scanner empsalary = new Scanner(System.in);
		System.out.println("Enter your salary :");
		Empsalary = empsalary.nextFloat();

		Scanner Phno = new Scanner(System.in);
		System.out.println("Enter your phone no:");
		phno = Phno.nextLong();
		System.out.println("Your Emp_id is :" + Empid);
		System.out.println("Your name is" + Empname);
		System.out.println("Your Age is:" + age);
		System.out.println("your Salary is :" + Empsalary);
		System.out.println("your Phone No is :" + Phno);
	}

}
