package com.test.junit;

public class Armstrong {

	
	public boolean armstrongCheck(Long num)
	{
		Long rem=0L,copy=num;
		double sum=0;
		
		int noOfDigits=noOfDigits(num);
		System.out.println(noOfDigits);
		while(num>0)
		{
			rem=num%10;
			sum=sum+Math.pow(rem, noOfDigits);
			num=num/10;
		}
		System.out.println(sum);
		if(copy==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	int noOfDigits(Long num)
	{
		int counter=0;
		while(num>0)
		{
			counter++;
			num=num/10;
		}
		return counter;
	}
}
