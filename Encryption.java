package com.guvi.logic;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   String s=scanner.nextLine();
	   s=s.toLowerCase();
	   String g="";
	   int a,b=0;
	   for(int i=0;i<s.length()-1;i++){
		   if(s.charAt(i)>=97 && s.charAt(i)<=122){
			   if(s.charAt(i)==97){
				   b=122;
				   g=g+(char)b;
			   }else if(s.charAt(i)==122){
				   b=97;
				   g=g+(char)b;
			   }else{
				   a=(int)s.charAt(i);
				   b=a-1;
				   g=g+(char)b;
			   }
		     
		   }
	   }
	   g=g+s.charAt(s.length()-1);
	   System.out.println(g);

	}

}
