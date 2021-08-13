package com.automation;

public class EncapsulationTest1 {
	
	private String employee;
	private int empID;
	private double salary;
	
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		//add security

		
		this.employee = employee;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		if(empID<=0) {
			System.out.println("invalid id");
			System.exit(1);
		}
		//add security
		this.empID = empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		//add security
		this.salary = salary;
	}

}
