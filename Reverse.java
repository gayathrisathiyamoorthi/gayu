package com.wipro.cse;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
	  String a="";
	  Scanner scanner=new Scanner(System.in);
	  String s=scanner.next();
	  for(int i=s.length()-1;i>=0;i--){
		a=a+s.charAt(i);  
	  }
	  System.out.println(a);
		

	}

}
