package com.test;

class Animal
{
	public String name;
	
	public Animal() {
		
	}
	public Animal(String name) {
	
		this.name = name;
	}
	
	public void printAnimal()
	{
		System.out.println(this.name);
	}
	
	
}


class Tiger extends Animal
{
	private String name;

	public Tiger() {
		
	}

	public Tiger(String name) {
		
		super(name);//referring immediate parent class constructor
	
	}
	
	public void display()
	{
		super.printAnimal();//referring immediate parent class method
		System.out.println(super.name);//referring immediate parent class data member
	}
	
}


public class SuperKeyword {

	public static void main(String[] args) {
	
		Tiger tiger=new Tiger("Siberian Tiger");
		
		tiger.display();
		
		
		
		

	}

}
