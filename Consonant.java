package com.wipro.cse;

import java.util.Scanner;

public class Consonant {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char c=scanner.next().charAt(0);
		c=Character.toLowerCase(c);
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(c==arr[i]){
				System.out.println("vowel");
				flag=true;
			}
		}
		if(flag==false){
			System.out.println("consonant");
		}



	}

}
