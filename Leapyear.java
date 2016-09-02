package com.guvi.first;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the year:");
	   int year=scanner.nextInt();
	   if(year%4==0){
		   System.out.println("leap year");
	   }else{
		   System.out.println("not leap year");
	   }

	}

}
