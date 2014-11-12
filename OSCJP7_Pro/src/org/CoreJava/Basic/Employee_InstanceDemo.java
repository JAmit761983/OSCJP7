package org.CoreJava.Basic;

public class Employee_InstanceDemo {

	public String name;
	public double salary;
	
	public Employee_InstanceDemo(String empName)
	{
		name = empName;
	}
	public void setempSalary(double empsalary)
	{
		salary = empsalary;
	}
	
	public void printDetails()
	{
		System.out.println("Name = " +name);
		System.out.println("Salary = " +salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_InstanceDemo empInst = new Employee_InstanceDemo("amit");
		empInst.setempSalary(4000);
		empInst.printDetails();

	}

}
