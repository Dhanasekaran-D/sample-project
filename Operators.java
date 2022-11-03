package com.java.dhanasekaran;

public class Operators {
	static int num1, num2, num3, sum1, sum2, sum3;

//static float sum2 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num1 = 80;
		num2 = 50;
//sum1=num3;
		System.out.println("Num 1 =" + num1);
		System.out.println("Num 2=" + num2);
		{
			sum1 = num1 + num2;
			System.out.println("The sum1 =" + sum1);
		}
		{
			num3 = sum1;
			sum2 = num3 / 2;
			System.out.println("The sum2=" + sum2);
		}
		sum3 = sum2 *= 10;
		System.out.println("The sum3 is =" + sum3);
	}

}
