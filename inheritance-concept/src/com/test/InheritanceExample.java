package com.test;

class A // parent/base/super class
{
	public long a=10;
	
	public void testA()
	{
		System.out.println("testA method invoked");
	}
}


class B extends A // child/sub/derived class
{
    public long b=20;
	
	public void testB()
	{
		System.out.println("testB method invoked");
	}
}


public class InheritanceExample {

	public static void main(String[] args) {
		
		B ob=new B();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.testA();
		ob.testB();
	}

}
