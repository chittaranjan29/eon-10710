package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//User defined class
public class Student implements Comparable<Student>{
	
	private long id;
	private String name;
	private long phone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	/*
	 * @Override public int compareTo(Student o) { if(this.name.equals(o.name)) {
	 * return 0; } else { return this.name.compareTo(o.name); } }
	 */
	

	@Override
	public int compareTo(Student o) {
		if(this.phone>o.phone)
		{
			return 1;
		}
		else if(this.phone<o.phone)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	
	public static void main(String[] args) {
	Student s1=new Student(2323, "Aman", 393827377);
	Student s2=new Student(3323, "Firoz", 83879373);
	Student s3=new Student(2323, "Anil", 95358959);
	Student s4=new Student(2323, "Roshni", 783838837);
	
	ArrayList<Student> students=new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4));	
	
	System.out.println("Before sorting..");
	for(Student s:students)
	{
		System.out.println(s);
	}
	Collections.sort(students);
	
	
	System.out.println("After sorting..");
	for(Student s:students)
	{
		System.out.println(s);
	}
	
	}
	
	

}
