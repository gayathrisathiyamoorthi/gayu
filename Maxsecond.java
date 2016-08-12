package com.guvi.logic;

import java.util.Scanner;

public class Maxsecond {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		int first=0,second=0,temp=0;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		second=arr[1];
		System.out.println(second);

	}

}
