package org.wipro.logic2;

import java.util.Scanner;

public class Countpower {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
	    int a=1,c=0,i=0,b=0;
		int[] arr=new int[10];
		while(n>0){
			c=n%10;
			n=n/10;
			arr[i]=c;
		    i++;
		}
		
		for(int j=0;j<i;j++){
			a=1;
			for(int k=0;k<i;k++){
				a=a*arr[j];
			}
			b=b+a;
		}
		System.out.println(b);
	}

}


