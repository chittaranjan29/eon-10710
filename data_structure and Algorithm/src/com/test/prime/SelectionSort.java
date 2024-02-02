package com.test.prime;

import java.util.Scanner;

public class SelectionSort {

	
	void sort(int ar[])
	{
		int n=ar.length;
		for(int i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(ar[j]<ar[min_idx])
				{
					min_idx=j;
				}
			}	
				int temp=ar[min_idx];
				ar[min_idx]=ar[i];
				ar[i]=temp;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n,key;
		boolean flag=false;
		SelectionSort ob=new SelectionSort();
		System.out.println("Enter the size of the array:");
		n=scanner.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("ar["+i+"] :");
			ar[i]=scanner.nextInt();
		}
		
		
		System.out.println("Before sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+ " ");
			
		}
		ob.sort(ar);
		
		System.out.println("\nAfter sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+ " ");
			
		}
		
		
		

	}

}
