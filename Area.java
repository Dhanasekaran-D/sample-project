package com.java.dhanasekaran;

import java.util.Scanner;

public class Area {
	int length;
	int breadth;

	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length=");
		int length = s.nextInt();
		System.out.println("Enter the breadth= ");
		int breadth = s.nextInt();
		Area rectangle = new Area(length, breadth);
		rectangle.getArea();
	}
}
