package com.wipro.Flowcontrol;

public class Numbers {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 0) {
			System.out.println(a + " is positive number.");
		} else if (a < 0) {
			System.out.println(a + " is negative number.");
		} else {
			System.out.println(a + " is zero.");
		}
		

	}

}
