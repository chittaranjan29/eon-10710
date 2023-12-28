package com.test;
class Employee
{
	public long id;
	public String name;
	public String designation;
	public String department;
	public double salary;
	
	
	public Employee()
	{
		
	}
	

	public Employee(long id, String name, String designation, String department, double salary) {
		
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}



	public void applyForLeave()
	{
		System.out.println("Leave applied!!");
	}
	
	public void drawSalary()
	{
		System.out.println("Salary drawn");
	}
	
	public void login()
	{
		System.out.println("logged in!!");
	}
	
	public void logout()
	{
		System.out.println("logged out!!");
	}
}


class Manager extends Employee
{
	public String role;
	
	public void addToManagerGroup()
	{
		System.out.println("Manager added in the group!!");
	}
	
}


class Developer extends Employee
{
	public String projectName;
	
	public void assignToProject()
	{
		System.out.println("Project assigned!!");
	}
}

class Designer extends Employee
{
public String projectName;
	
	public void assignToProject()
	{
		System.out.println("Project assigned!!");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		Designer designer=new Designer();
		
		designer.id=123;
		designer.name="Sunil";
		designer.designation="Sr. UI designer";
		designer.department="ABC123";
		designer.projectName="project 1";
		designer.salary=60000; 
		
		designer.login();
		designer.logout();
		designer.applyForLeave();
		designer.assignToProject();
		designer.drawSalary();
	

		
		Manager manager=new Manager();
		manager.id=553;
		manager.name="Kumar";
		manager.designation="Manager";
		manager.department="XYZ123";
		manager.role="Asst. Manager";
		manager.salary=90000; 
		
		manager.login();
		manager.logout();
		manager.applyForLeave();
		manager.addToManagerGroup();
		manager.drawSalary();
	}

}
