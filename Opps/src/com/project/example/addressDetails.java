package com.project.example;
class Employee{
	int empid;
	String empName;
	int salary;
	String address;
	public Employee(int empid, String empName, int salary, String address) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
}
public class addressDetails {

	public static void main(String[] args) {

	}

}
