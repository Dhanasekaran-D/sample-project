package com.java.dhanasekaran;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int mark;
		System.out.println("Enter your mark");
		mark = scanner.nextInt();

		if (mark >= 90) {
			System.out.println("Grade A");
		} else if (mark >= 80) {
			System.out.println("Grade B");
		} else if (mark >= 70) {
			System.out.println("Grade C");

		} else if (mark >= 60) {
			System.out.println("Grade D");

		}

		else {
			System.out.println("Grade E");
		}
	}

}
