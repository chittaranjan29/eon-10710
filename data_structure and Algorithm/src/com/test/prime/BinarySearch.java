package com.test.prime;

import java.util.Scanner;

public class BinarySearch {

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
		
		int lower=0,upper=n-1;
		
		while(lower<=upper)
		{
	
		int mid=lower+(upper-1)/2;
		
		if(ar[mid]==key)
		{
			System.out.println("Element present at "+mid+" index");
			flag=true;
			break;
		}
		else if(key>ar[mid])
		{
			lower=mid+1;
		}
		else		
		{
			upper=mid-1;
		}
		}
		
		
		if(!flag)
		{
			System.out.println("Element not found!"); 
		}				
		
		
		
		
		

	}

}
