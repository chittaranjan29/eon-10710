package com.test;

class Outer
{
	public static int a=10;
	private static int b=20;
	
	public void outerTest()
	{
		System.out.println("This is outer test method");
	}
	
	static class Inner
	{
		void innerTest()
		{
			System.out.println(a);
			System.out.println(b);
			
		}
	}
}



public class StaticMestedClassExample {

	public static void main(String[] args) {
		
		Outer.Inner ob=new Outer.Inner();
		ob.innerTest();

	}

}
