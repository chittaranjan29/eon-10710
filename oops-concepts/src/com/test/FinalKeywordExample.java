package com.test;
class TestA //can't inherit the class as its type is final  
{
	final int a=10;//constant
	
	final public void test()
	{
		System.out.println("test method invoked");
	}
}

class Sample extends TestA
{
	//@Override
	//final public void test()
	//{
	//	System.out.println("test method invoked");
	//}
}

public class FinalKeywordExample {

	public static void main(String[] args) {
		
		TestA test=new TestA();
		//test.a=20;
		
	}

}
