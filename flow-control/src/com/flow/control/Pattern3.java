package com.flow.control;
/*
 
     *
    * *
   * * *
  * * * * 
 * * * * * 
 
 * */
public class Pattern3 {

	public static void main(String[] args) {
		
		
		int i=0,j=0,k=0,n=5;
		
		for(i=1;i<=n;i++)
		{
			
			for(k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
