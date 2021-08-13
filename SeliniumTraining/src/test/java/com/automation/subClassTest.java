package com.automation;

public class subClassTest extends SuperClass{
	
	public void m2() {
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		
		subClassTest in=new subClassTest();
		in.m1();
		in.s1="vijay";
		
	}

}
