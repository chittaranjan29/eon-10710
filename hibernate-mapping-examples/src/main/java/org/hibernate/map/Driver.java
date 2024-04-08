package org.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String contact;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver( String name, String contact) {
		
	
		this.name = name;
		this.contact = contact;
	}
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	

}
