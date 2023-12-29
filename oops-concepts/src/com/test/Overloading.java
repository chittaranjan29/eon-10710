package com.test;

class Addition
{
	public void add(long a,long b)
	{
		System.out.println(a+b);
	}
	
	public void add(long a,long b,long c)
	{
		System.out.println(a+b+c);
	}
	
	
	public void add(float a,float b,float c)
	{
		System.out.println(a+b+c);
	}
	
	
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
}



public class Overloading {

	public static void main(String[] args) {
		
		Addition addition=new Addition();
		
		addition.add(89, 66);
		//this statement will be resolved and compiler will decide the method that needs to be called
		//at compile time.
		
		addition.add(89, 66, 88);
	}

}
