package com.wipro.cse;

import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a,b=0;
		while(n>0){
			a=n%10;
			n=n/10;
			b=b*10+a;
		}
		System.out.println(b);

	}

}
