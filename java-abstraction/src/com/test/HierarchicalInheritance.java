package com.test;
class A
{
	public void testA()
	{
		System.out.println("testA method invoked..");
	}
}

class A1 extends A
{
	public void testA1()
	{
		System.out.println("testA1 method invoked..");
	}
}

class A2 extends A
{
	public void testA2()
	{
		System.out.println("testA2 method invoked..");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		A1 a1=new A1();
		a1.testA();
		a1.testA1();
		
		A2 a2=new A2();
		a2.testA2();
		a2.testA();

	}

}
