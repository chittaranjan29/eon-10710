package com.flow.control;

public class IfElseExample {

	public static void main(String[] args) {
		
		int a=5,b=10,c=15;
		
		if(a>b)  //a>b - expression - evaluated to boolean value - false
		{
			System.out.println("Hi everyone!!");
		}
		else
		{
			System.out.println("Bye everyone!!");
		}
		
		
		
		//if-elseif-else ladder
		a=5;
		b=5;
		c=5;
		
		if(a>b)  //a>b - expression - evaluated to boolean value - false
		{
			System.out.println("Hi everyone!!");
		}
		else if(b>c)
		{
			System.out.println("Good Morning everyone!!");
		}
		else if(c>a)
		{
			System.out.println("Good Afternoon everyone!!");
		}
		else
		{
			System.out.println("Bye everyone!!");
		}
		
		
		//Nested if-else
		a=5;
		b=15;
		c=25;
		if(a>b)  //outer if
		{
			if(a>c)//inner if
			{
			  System.out.println(a +" is greater");
			}
			else
			{
				System.out.println(c +" is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b +" is greater");
			}
			else
			{
				System.out.println(c +" is greater");
			}
		}
		

	}

}
