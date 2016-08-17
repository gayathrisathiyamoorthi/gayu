package com.wipro.cse;

import java.util.Scanner;

public abstract class Alphabet {
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    char c=scanner.next().charAt(0);
	    boolean flag=Character.isAlphabetic(c);
	    if(flag==true){
	    	System.out.println("Alphabet");
	    }else{
	    	System.out.println("not alphabet");
	    }

	}

}
