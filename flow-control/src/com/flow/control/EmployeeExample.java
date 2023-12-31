package com.flow.control;

class Employee
{
	//instance variables / Data members (represents states of the object)
	long id;
	String name;
	String organisationName;
	String departmentName;
	double salary;
	
	//default constructor
	public Employee()
	{
		System.out.println("constructor invoked");
	}
	
	//parameterized constructor
	public Employee(long eid,String ename,String oname,String dname,double esalary)
	{
		System.out.println("parameterized constructor invoked");
		id=eid;
		name=ename;
		organisationName=oname;
		departmentName=dname;
		salary=esalary;
	}
	
	//instance methods (represents actions of the object)
	public void signIn()
	{
		System.out.println("Signin completed!");
	}

	public void signOut()
	{
		System.out.println("Signout completed!");
	}
	

	public void salaryDrawn()
	{
		System.out.println("Salary received!");
	}
	
	
	public void applyLeave()
	{
		System.out.println("Leave applied!!");
	}
}


public class EmployeeExample {

	public static void main(String[] args) {
		
     Employee employee1=new Employee();
     employee1.id=262;
     employee1.name="Raman";
     employee1.organisationName="ABC pvt ltd.";
     employee1.salary=70000;
     employee1.signIn();
     employee1.signOut();
     employee1.applyLeave();
     employee1.salaryDrawn();
     
     
     Employee employee2=new Employee(567,"Anil","XYZ pvt. ltd.","It department",67000);
     employee2.signIn();
     employee2.signOut();
     employee2.applyLeave();
     employee2.salaryDrawn();
     
     System.out.println(employee1);
     System.out.println(employee2);
     
	}

}
