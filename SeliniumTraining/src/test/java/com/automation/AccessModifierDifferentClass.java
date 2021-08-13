package com.automation;

public class AccessModifierDifferentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccesModifierTest outside=new AccesModifierTest();
		//outside.m1();                                 private method  not able to access outside the class
		//String outsideVar=outside.input;              private variable not able to access outside the class
		
		outside.publicVar="public varible in different class";  //public variables -able to access in different class in same package
		System.out.println(outside.publicVar);                  
		outside.publicMethod();                                //Public method -able to acces in different class in same package
		
		
		outside.defaultVar="default variable access in different class";    //default variables -able to access in different class in same package
		System.out.println(outside.defaultVar);
		outside.defaultMethod();                                            //default Method -able to access in different class in same package
		
		
		outside.protectedVar="protected variable";                         //protected variable-able to access in different class in same package
		System.out.println("protectedVar");
		outside.protectedMethod();                                         //protected method-able to access in different class in same package
	}

}
