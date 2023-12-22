package com.flow.control;

public class ForExample {

	public static void main(String[] args) {
		
		int i;		
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		i=1;
		for(;i<=10;)
		{
			System.out.println(i);
			i++;
		}
		
		//Infinite or endless loop
		/*
		 * for(;true;) { System.out.println("hello world"); }
		 */
		
		for(i=10;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
