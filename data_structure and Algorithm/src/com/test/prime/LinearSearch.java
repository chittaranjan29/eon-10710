package com.test.prime;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n,key;
		boolean flag=false;
		
		System.out.println("Enter the size of the array:");
		n=scanner.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("ar["+i+"] :");
			ar[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the key element:");
		key=scanner.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			if(key==ar[i])
			{
				System.out.println("Element present at "+i+" index");
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("Element not found!"); 
		}
		
		
		
		
		
		
		

	}

}
