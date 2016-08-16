package com.wipro.cse;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int count=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j)){
				count++;
			}
			}
		}
		int c=s.length()-1-count;
		System.out.println(c);

	}

}
