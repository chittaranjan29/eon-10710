package com.test.junit;

public class Factorial {
	
	public long calculateFactorial(int num)
	{
	  if(num>=0)
	  {
		int i=1,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		 return fact;
	  }
	  else
	  {
		  return  -1;
	  }
		
		
	}

}
