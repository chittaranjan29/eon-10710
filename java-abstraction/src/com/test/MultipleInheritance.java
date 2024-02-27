package com.test;
interface C
{
	void testA1();
}

interface D
{
	void testB1();
}

class Impl implements C,D
{

	@Override
	public void testB1() {
		System.out.println("This is testB method");
		
	}

	@Override
	public void testA1() {
		System.out.println("This is testA method");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Impl c=new Impl();
		c.testA1();
		c.testB1();

	}

}
