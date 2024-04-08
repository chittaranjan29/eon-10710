package com.test;


//Persistent class
public class Student {

	private long id;
	private String name;
	private String city;
	private String standard;
	private String roll;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, String city, String standard, String roll) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.standard = standard;
		this.roll = roll;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", standard=" + standard + ", roll=" + roll
				+ "]";
	}
	
	
}
