package com.test;

public class StaticKeywordExample {

	private int a=10;//non static variable
	private static int b=20;//static variable
	
	
	static //it gets invoked at the time of class loading even before the main method of the class
	{
		System.out.println("This is a static block");
		//System.out.println(a);
		System.out.println(b);
		test();
		//demo(); //Non-static method can not be called 
	}
	
	public static void test()//a static method can access only static variable
	{
		System.out.println("This is a static method");
		//System.out.println(a);
		System.out.println(b);
	}
	
	
	public void demo() //non static method can access both static/non-static variable
	{
		System.out.println("This is a non static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticKeywordExample ob=new StaticKeywordExample();
		
				
		StaticKeywordExample.test();
		ob.test();
		test();
	}

}
