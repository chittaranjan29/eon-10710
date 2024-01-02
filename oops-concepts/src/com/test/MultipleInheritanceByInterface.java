package com.test;

interface A
{
	public void testA();
}


interface B
{
	public void testB();
}


class C implements A,B
{

	@Override
	public void testB() {
		System.out.println("This is testB method");
		
	}

	@Override
	public void testA() {
		System.out.println("This is testA method");
		
	}
	
}
public class MultipleInheritanceByInterface {

	public static void main(String[] args) {
		
		C obj=new C();
		obj.testA();
		obj.testB();
		

	}

}
