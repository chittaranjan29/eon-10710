package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
	private List<Employee> employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String name, List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	
	
}
