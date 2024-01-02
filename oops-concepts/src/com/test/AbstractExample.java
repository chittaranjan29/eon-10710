package com.test;

abstract class Test
{
	public Test()
	{
		System.out.println("constructor");
	}
    abstract void test();
      
   void sample()
   {
	 System.out.println("This is a non-abstract method ");   
   }
   
   static void demo()
   {
	   System.out.println("This is a static method");
   }
   
   final void finalSample()
   {
	   
   }
}

  class TestImplementation extends Test
{

	@Override
	void test() {
		
		System.out.println("This is the body of test method");
		
	}
	
}


public class AbstractExample  {

	public static void main(String[] args) {
		
     Test obj=new TestImplementation();
     TestImplementation implObj=new TestImplementation();
     //Test obj1=new Test();
     obj.test();
     obj.sample();
     obj.demo();
     Test.demo();
     
     
     implObj.test();
     implObj.sample();
	}

}
