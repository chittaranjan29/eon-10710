package com.flow.control;
/*
*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 
* 
* 
*/
public class Pattern1 {

	public static void main(String[] args) { 
											  		
		int i,j;                             
		//no of elements=line number         
		for(i=1;i<=5;i++)   //i=1 1<=5 i=2 2<=5 i=3
		{
			for(j=1;j<=i;j++) //j=1 1<=2, j=2 2<=2 j=3 3<=2
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}

}
