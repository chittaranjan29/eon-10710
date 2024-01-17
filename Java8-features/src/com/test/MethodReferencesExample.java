package com.test;
class Test
{
	public void demo()
	{
		System.out.println("demo method invoked");
	}
	
	public static void sample()
	{
		System.out.println("sample method invoked");
	}
}

interface Testable
{
	void say();
}

public class MethodReferencesExample {

	public static void main(String[] args) {
		
		Test t=new Test();
		Testable test=t::demo;
		test.say();
		
		
		Testable test1=Test::sample;
		test1.say();
	}

}
