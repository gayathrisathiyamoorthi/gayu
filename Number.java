package com.guvi.first;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String r="";
		for(int i=0;i<n/2;i++){
			int s=scanner.nextInt();
			int t=scanner.nextInt();
			if(s>0 && t>0){
			int c=(s*t)-1;
			r=r+c;
			}
			else{
				r=r+0;
			}
		}
		System.out.println(r);

	}

}
