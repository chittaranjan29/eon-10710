package com.test;
class Shape
{
	String name;
	void ShapeTest()
	{
		System.out.println("Shapetest method invoked");
	}
}

class Circle extends Shape
{
	void shapeCircle()
	{
		System.out.println("shapeCircle method invoked");
	}
}

class SemiCircle extends Circle
{
	void shapeSemiCircle()
	{
		System.out.println("SemiCircle method invoked");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		SemiCircle semiCircle=new SemiCircle();
		semiCircle.shapeSemiCircle();
		semiCircle.shapeCircle();
		semiCircle.ShapeTest();
	}

}
