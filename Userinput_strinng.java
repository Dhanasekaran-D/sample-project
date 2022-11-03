package com.java.dhanasekaran;

import java.util.Scanner;

public class Userinput_strinng {
	public static void main(String args[]) {
		String userinput;
		int i = 0, len;
		int count = 0;
		int counter[] = new int[256];
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The string: ");

		userinput = scanner.nextLine();

		System.out.println("\n" + userinput);
		while (i < userinput.length()) {
			
			count++;
			i++;
		}

		len = userinput.length();
		
		System.out.println("\nTotal no.of the Charactors  = " +len);
	
		for (i = 0; i < len; i++) 
			if (userinput.charAt(i) != ' ')
			 {
				counter[(int) userinput.charAt(i)]++;
			}

		for (i = 0; i < 256; i++) {
			if (counter[i] != 0) {
				System.out.println((char) i + " --> " + counter[i]);
			}
		}
	}

}