package com.test;

public class App {

	public static void main(String[] args) {
		
		int a =10,b=7,c=0;
		String st=null;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a+c);
		System.out.println(a*b);
		System.out.println(a/b);
		try
		{
			System.out.println(a/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
		 System.out.println(st.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
		System.out.println(Math.pow(a, b));	
		System.out.println(Math.sqrt(a));
		}
	}

}
