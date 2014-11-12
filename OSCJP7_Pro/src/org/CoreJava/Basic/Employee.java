package org.CoreJava.Basic;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name) {
			this.name = name;
	}
	public void  EmployeeAge(int EmpAge)
	{
		age = EmpAge;
	}
	public void  EmpDesg(String EDesg)
	{
		designation = EDesg;
	}
	public void empSalary(double empSalary)
	{
		salary  = empSalary;
	}
	public void printEmployee()
	{
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Designation : " +designation);
		System.out.println("Salary : " +salary);
	}
}
