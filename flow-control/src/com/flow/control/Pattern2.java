package com.flow.control;
/*
 *
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 * 
 * 
 */
public class Pattern2 {

	public static void main(String[] args) {
		
		int i=0,j=0, n=5;
		
		for(i=1;i<=5;i++)			
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}

	}

}
