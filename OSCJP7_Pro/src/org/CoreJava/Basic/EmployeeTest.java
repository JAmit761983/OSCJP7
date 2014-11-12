package org.CoreJava.Basic;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("Amit");
		Employee empTwo = new Employee("Jaimin");
		
		empOne.EmployeeAge(30);
		empOne.EmpDesg("Seniro Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.EmployeeAge(29);
		empTwo.EmpDesg("Network Engineer");
		empTwo.empSalary(2000);
		empTwo.printEmployee();
		
		
	}

}
