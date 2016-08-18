package com.guvi.logic;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String[] a=s.split(" ");
		String c="",d="";
		for(String b:a){
			c=new StringBuilder(b).reverse().toString();
			d+=c+" ";
		}
	    System.out.println(d);

	}

}
