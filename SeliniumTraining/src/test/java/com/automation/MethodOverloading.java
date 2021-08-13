package com.automation;

public class MethodOverloading {
	
	public void display(String firstname) {
		System.out.println("firstName " +firstname);
	}
	
	public void display(String firstName, String middleName)
	{
		System.out.println("firstName " + firstName +" middleName " +middleName);
	}
	
	public void display(String firstName,String middleName, String lastName)
	{
		System.out.println("firstname "+ firstName +" middlename "+ middleName +" lastName " + lastName);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading ml1=new MethodOverloading();
				
		ml1.display("Vijay");
		
		ml1.display("Vijay","Kumar");
		ml1.display("Vijay","Kumar","Regulavalasa");
	
		
	}

}
