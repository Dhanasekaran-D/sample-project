package com.java.dhanasekaran;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size  ");
		n = scr.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the value");

		for (int i = 0; i < n; i++)

		{
			array[i] = scr.nextInt();
		}
		System.out.println("The even number is:");

		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)

				System.out.println(array[i] + "");
		}

		// system.out.println();
		System.out.println("The odd numbers");
		for (int i = 0; i < n; i++) {

			{
				if (array[i] % 2 != 0)

					System.out.println(array[i] + "");
			}
		}
	}
}
