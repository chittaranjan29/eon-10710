package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "instructor_info")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String city;
	private String email;
	
	@OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL)
    private List<Course> courses;

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(String name, String city, String email, List<Course> courses) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.courses = courses;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", courses="
				+ courses + "]";
	} 	
	
	

}