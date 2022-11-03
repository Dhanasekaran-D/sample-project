package com.java.dhanasekaran;

import java.util.Scanner;
import java.util.Arrays;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size  ");
		n = scr.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value");

		for (int i = 0; i < n; i++)
			arr[i] = scr.nextInt();
		System.out.println("The even number is:");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				System.out.println(arr[i] + "" + Arrays.toString(arr));
		}
		// system.out.println();
		System.out.println("The odd numbers");
		for (int i = 0; i < n; i++) {// System.out.println();
			if (arr[i] % 2 != 0)
				System.out.println(arr[i] + "" + Arrays.toString(arr));
		} // System.out.println();
	}
}
