package com.test.prime;

import java.util.Scanner;

public class BubbleSort {
	
	void sort(int ar[])
	{
	  int i,j,temp,n;
	  n=ar.length;
	  boolean swapped;
	  
	  for(i=0;i<n-1;i++)
	  {
		  swapped=false;
		  for(j=0;j<n-i-1;j++)
		  {
			  if(ar[j]>ar[j+1])
			  {
				  temp=ar[j];
				  ar[j]=ar[j+1];
				  ar[j+1]=temp;
			  }
		  }
		  
		  if(swapped==false)
			  break;
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
