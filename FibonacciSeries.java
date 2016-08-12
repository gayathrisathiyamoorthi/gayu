package com.guvi.logic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=-1,b=1,c=0,d=0;
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<=n;i++){
			c=a+b;
			d=d+c;
			a=b;
			b=c;
		}
		System.out.println(d);
	}

}
