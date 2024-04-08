package org.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String number;
	private String brand;
	private String modelNo;
	private String color;
	
	@OneToOne
	private Driver driver;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Car( String number, String brand, String modelNo, String color, Driver driver) {
		
	
		this.number = number;
		this.brand = brand;
		this.modelNo = modelNo;
		this.color = color;
		this.driver = driver;
	}
	public long getId() {
		return id;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", number=" + number + ", brand=" + brand + ", modelNo=" + modelNo + ", color=" + color
				+ ", driver=" + driver + "]";
	}
	
	
	
	
}
