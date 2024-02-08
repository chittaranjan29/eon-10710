package com.test.prime;

public class QuickSort {

	static void swap(int arr[], int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	// This function takes last element as pivot, places the pivot element at its correct position
	// in sorted array, and places all smaller to left of pivot and all greater elements to right of pivot. 
	static int partition(int arr[], int low, int high)
	{
		int pivot=arr[high];
		int i=(low-1);
		
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr, i+1,high);
		return i+1;
	}
	
	
	static void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			//pi is partitioning index, arr[p] will be placed in the right position
			int pi=partition(arr, low, high);
			
			//separately sort the elements before partition  and after partition
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+2, high);
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {10, 80, 30, 90, 40, 50, 70}; 
		int N=arr.length;
		System.out.println("Before sorting:\n");
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		quickSort(arr,0,N-1);
		
		System.out.println("\n After sorting:\n");
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		

	}

}
