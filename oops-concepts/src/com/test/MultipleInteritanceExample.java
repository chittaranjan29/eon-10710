package com.test;
interface A1
{
	public void testA1();
}


interface B1
{
	public void testB1();
}

interface C1 extends A1,B1
{
	public void testC1();
}


class Impl implements C1
{

	@Override
	public void testA1() {
		System.out.println("This is test1 method");
		
	}

	@Override
	public void testB1() {
		System.out.println("This is testB1 method");
		
	}

	@Override
	public void testC1() {
		System.out.println("This is testC1 method");
		
	}
	
}

public class MultipleInteritanceExample {

	public static void main(String[] args) {
		
		Impl impl=new Impl();
		impl.testA1();
		impl.testB1();
		impl.testC1();
	}

}
