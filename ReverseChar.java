package com.guvi.logic;

import java.util.Scanner;

public class ReverseChar {
	public static void main(String[] args) {
		String s, a = "";
		System.out.println("enter the string");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			a = a + s.charAt(i)+'-';

		}
		System.out.println(a);

	}

}
