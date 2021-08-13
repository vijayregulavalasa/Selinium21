package com.automation;

public class AccesModifierTest {

	private String input = null;
	public String publicVar = null;
    String defaultVar=null;
    protected String protectedVar=null;
    
	private void m1() {
		System.out.println("private method");
	}

	public void publicMethod() {
		System.out.println("public method");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
	
	 protected void protectedMethod() {
		System.out.println("protected method");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AccesModifierTest AM = new AccesModifierTest();
		AM.m1();

		AM.publicVar = "str1";
		AM.publicMethod();

	}

}
