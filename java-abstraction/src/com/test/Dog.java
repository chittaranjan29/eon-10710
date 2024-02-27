package com.test;
class Animal
{
  String name;
  
  void eat()
  {
	  System.out.println("Eating....");
  }
  
  void sleep()
  {
	  System.out.println("Sleeping...");
  }
}

class Dog extends Animal
{
	String breed;
	
	void barks()
	{
		System.out.println("Dog is barking....");
	}
	
	void tailWagging()
	{
		System.out.println("Dog is wagging tail...");
	}
	
	public static void main(String args[])
	{
		Dog dog=new Dog();
		dog.eat();
		dog.sleep();
		dog.barks();
		dog.tailWagging();
		dog.name="Tommy";
		dog.breed="Dobermann";
		System.out.println(dog.name + ":" +dog.breed);
		
		
	}
}




