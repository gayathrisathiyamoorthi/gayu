package com.wipro.cse;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=1;
		for(int i=1;i<=n;i++){
			a=a*i;
		}
		System.out.println(a);

	}

}
