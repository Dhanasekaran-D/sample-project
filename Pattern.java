package com.java.dhanasekaran;

//import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scr=new Scanner(System.in);
		// System.out.println("Enter tne value");
		// n=scr.nextInt();

		for (int i = 1; i <= 4; i++) {
			int n = 5;
			for (int j = 1; j <= n - i; j++) {
				// System.out.println("");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

//static int n;
//System.out.println("Enter the next value");
//n=scr.nextInt();
		/*
		 * int n=7; for(int i=3;i>=1;i--) {
		 * 
		 * 
		 * for(int j=0;j<=n-i;j++) { //System.out.println(""); } for(int k=i;k>=1;k--) {
		 * System.out.print(k); } for(int l=2;l<=i;l++) { System.out.print(l); }
		 * }System.out.println();
		 */
	}
}
