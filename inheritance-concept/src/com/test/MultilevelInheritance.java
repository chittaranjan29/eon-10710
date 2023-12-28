package com.test;
class GrandParent
{
	public void test1()
	{
		System.out.println("test1 method invoked");
	}
}

class Parent extends GrandParent
{
	public void test2()
	{
		System.out.println("test2 method invoked");
	}
}


class Child extends Parent
{
	public void test3()
	{
		System.out.println("test3 method invoked");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.test1();
		child.test2();
		child.test3();

	}

}
