package com.constMethods;

public  class Employee {

	// instance variables

	public int empid;
	public String empName;
	public double salary;

	// constructor for initiliaze value. Constructor should be same name of class

	// parametrized constructor

	public Employee(int empid, String empName, double salary) {
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	//method
	public void display() {
		
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(salary);
		
	}
	
	//static method
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	//abstract method
	//public abstract void abstractMethod();
	
	
	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee(); e1.empid = 10070; e1.empName = "vijay";
		 * e1.salary = 1051243.23;
		 * 
		 * System.out.println(e1.empName); System.out.println(e1.empid);
		 * System.out.println(e1.salary);
		 * 
		 * Employee e2 = new Employee(); e2.empid = 10080; e2.empName = "Ajay";
		 * e2.salary = 1023103.52; 
		 * 
		 * 	System.out.println(e2.empid);
		System.out.println(e2.empName);
		System.out.println(e2.salary);

		 */

		Employee e1 = new Employee(10070, "vijay", 1023456.33);
		e1.display();
		e1.staticMethod();
		Employee.staticMethod();

	
	}
}
