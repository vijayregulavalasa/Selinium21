package com.automation;

public class EncapsulationTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationTest1 e1 = new EncapsulationTest1();

		// we can directly acces varaibles of EncapsulationTest1 as they are declared as
		// private
		// These methods can be accessed by using public methods -encapsulation concept-
		// security

		e1.setEmpID(10070);
		e1.setEmployee("Vijay");
		e1.setSalary(102050);
		
		System.out.println(e1.getEmpID());
		System.out.println(e1.getEmployee());
		System.out.println(e1.getSalary());

	}

}
