package com.constMethods;

import com.automation.AccesModifierTest;

public class AccessModifierOutsidePackage extends AccesModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesModifierTest outside=new AccesModifierTest();
		outside.publicVar="Public varaible in different package";            //public varaible -able to access in different package
		System.out.println(outside.publicVar);                             
		outside.publicMethod();                                               //public  method -able to access in different package
		
		
		
		//outside.defaultVar="default variable access in different class";    // Errors displayed-default variables are not accessed in different package
		//System.out.println(outside.defaultVar);
		//outside.defaultMethod();                                            // Errors displayed -default methods are not accessed in different pacakage
		
		AccessModifierOutsidePackage e=new AccessModifierOutsidePackage();
		e.protectedVar="protected varaible inherited";                             //able to access -as protected and inherited variables can be accessed
		e.protectedMethod();                                                       //able to access- as protected and inherited method can be accessed
	}

}
