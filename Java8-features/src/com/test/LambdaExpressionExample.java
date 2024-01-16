package com.test;

@FunctionalInterface
interface Drawable
{
	public void draw();

}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		Drawable drawable=() -> {
			System.out.println("draw method invoked");
		};
		
		drawable.draw(); 

	}

}
