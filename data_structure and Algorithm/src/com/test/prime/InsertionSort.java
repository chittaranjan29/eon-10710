package com.test.prime;

public class InsertionSort {

	void sort(int ar[])
	{
		int n=ar.length;
		for(int i=1;i<n;++i)
		{
			int key=ar[i];
			int j=i-1;
			
			while(j>=0 && key<ar[j])
			{
				ar[j+1]=ar[j];
				j=j-1;
			}
			
			ar[j+1]=key;
			
		}
	}
	
	void print(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int ar[]= {12,11,13,5,6};
		InsertionSort insertionSort=new InsertionSort();
		
		insertionSort.sort(ar);
		
		insertionSort.print(ar);
	}

}
