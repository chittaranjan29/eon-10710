package com.test.prime;

public class MergeSort {

	//Merege two subarrays of arr[]
	//first subarray arr[l..m]
	//second subarray arr[m+1..r]
	void merge(int ar[], int l, int m, int r )
	{
		//find the size of two subarrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		
		//create temp array
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//copy data to temp arrays
		for(int i=0;i<n1;++i)
		{
			L[i]=ar[l+i];
		}

		for(int j=0;j<n2;++j)
		{
			R[j]=ar[m+1+j];
		}
		
		int i=0, j=0;
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				ar[k]=L[i];
				i++;
			}
			else
			{
				ar[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			ar[k]=L[i];
			i++;
			k++;
		}
		
		
		while(j<n2)
		{
			ar[k]=R[j];
			j++;
			k++;
		}
	}
		
		
		void sort(int ar[], int l, int r)
		{
			if(l<r)
			{
				int m=l+(r-l)/2;
				sort(ar,l,m);
				sort(ar,m+1,r);
				
				merge(ar, l, m,r);
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
		MergeSort mergeSort=new MergeSort();
		mergeSort.print(ar);
		
		mergeSort.sort(ar, 0, ar.length-1);
		
		System.out.println();
		mergeSort.print(ar);
	}

}
