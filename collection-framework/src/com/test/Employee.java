package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee {

		public long id;
		public String name;
		public long phone;
		public double salary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(long id, String name, long phone, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.salary = salary;
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
		}
		
		
		public static void main(String[] args) {
			Employee e1=new Employee(213123,"Raman",35355,20000);
			Employee e2=new Employee(656566,"Rina",5653535,25000);
			Employee e3=new Employee(553535,"Smita",3333323,12000);
			Employee e4=new Employee(213123,"Anita",33535656,15000);
			
			ArrayList<Employee> employees=new ArrayList<Employee>(Arrays.asList(e1,e2,e3,e4));
			
			
			System.out.println("Before sorting");
			for(Employee e:employees)
			{
				System.out.println(e);
			}
			
			
			Collections.sort(employees, new SalaryComparator());
			
			System.out.println("After sorting");
			for(Employee e:employees)
			{
				System.out.println(e);
			}
			
		}

	}


class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
			return (int) (o1.salary - o2.salary);
		}
	}
	
class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
			return o1.name.compareTo( o2.name);
		}
	}




