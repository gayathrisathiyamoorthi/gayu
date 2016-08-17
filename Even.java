package com.wipro.cse;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   int n=scanner.nextInt();
	   if(n%2==0){
		   System.out.println("Even number:"+n);
	   }else{
		   System.out.println("Odd number:"+n);
	   }
	}

}
