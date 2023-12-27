package com.test;

class Student
{
	//data members or instance variables
	private long id;
	private String name;
	private static String schoolName="ABc School";//created in class area
	
	//default constructor
	public Student() {
		System.out.println("Default constructor invoked");
	}

	//parameterized constructor
	public Student(long id, String name,String schoolName) {
		
		//invokes the default constructor 
		this();
		
		this.id = id;
		this.name = name;
		Student.schoolName=schoolName;
		
		//this.display();
		this.print(this);
	}
	
	//instance method
	public void display()
	{
		System.out.println("Id :"+this.id+"\n"+"Name :"+this.name +"\n"+Student.schoolName);
	}
	
	public void print(Student s)
	{
		System.out.println("Id :"+s.id+"\n"+"Name :"+s.name+"\n"+Student.schoolName);
	}
	
	
	
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		
		Student student1=new Student(111, "Raman","Abc school");
		Student student2=new Student(222, "Anita","Abc school");
		
		//student1.display();
		//student2.display();
		

	}

}
