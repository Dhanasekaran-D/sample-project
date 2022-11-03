
package com.java.dhanasekaran;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scr.nextInt();
		int sum = 0;
		while (n >= 0) {
			System.out.println("Enter the number");
			sum += n;
			n = scr.nextInt();
		}
		System.out.println("The positive value is=" + sum);
	}

}
