package com.test;

interface Shape
{
	public void draw();
	default public void fillColor()
	{
		System.out.println("fill color");
	}
	
	static void test()
	{
		System.out.println("static method");
	}
}

class Circle implements Shape
{

	@Override
	public void draw() {
		
		System.out.println("Circle draw implementation");
		
	}
	
}

class Square implements Shape
{

	@Override
	public void draw() {
		System.out.println("Square draw implementation");
		
	}
	
}


public class DefaultAndStaticMethod {

	public static void main(String[] args) {
		
		Square square=new Square();
		square.draw();
		
		
		Circle circle=new Circle();
		circle.draw();
		
		
		
		circle.fillColor();
		square.fillColor();

	}

}
