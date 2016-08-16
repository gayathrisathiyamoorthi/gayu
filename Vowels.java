package com.wipro.cse;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (s.charAt(i) == arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
