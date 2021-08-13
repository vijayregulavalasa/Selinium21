package com.automation;

public class subsubClass extends subClassTest{
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		subsubClass s=new subsubClass();
		s.m1();
		s.m2();
		s.m3();
		
		
	}

}
