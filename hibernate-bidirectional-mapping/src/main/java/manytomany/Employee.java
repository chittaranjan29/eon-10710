package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.t)
	private long id;
	private String name;
	private String designation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employees_projects", 
	joinColumns = {
			@JoinColumn(name="employee_id")},
	inverseJoinColumns = {
			@JoinColumn(name="project_id")	
	})
	private List<Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String designation, List<Project> projects) {
		super();
		this.name = name;
		this.designation = designation;
		this.projects = projects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", projects=" + projects
				+ "]";
	}	
	
	
}
