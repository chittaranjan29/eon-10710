package com.test;
class Parent
{
	 void print()
	{
		System.out.println("parent method");
	}
}


class Child extends Parent
{
	void print()
	{
		System.out.println("child  method");
	}	
}


public class Overriding {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.print();
		
		Parent parent=new Child();
		parent.print();
		
		
		Parent parent1=new Parent();
		parent1.print();
		
	}

}
