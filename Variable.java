package com.java.dhanasekaran;

public class Variable {
	String name = "Dhanasekaran";
	static int age = 21;

//float hight=6.2f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hight = 6.2f;
		Variable obj = new Variable();
		System.out.println("instance variable is=" + obj.name);
		System.out.println("local variable is=" + hight);
		System.out.println("static variable is=" + age);
	}

}
