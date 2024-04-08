package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
