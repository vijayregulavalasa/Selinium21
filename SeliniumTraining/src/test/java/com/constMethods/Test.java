package com.constMethods;

public class Test {

	public void openBrowser() {
		System.out.println("Open the browser");
	}

	public void closeBrowser() {
		System.out.println("close the browser");
	}

	public static void login() {
		System.out.println("Login into the application");
	}

	public static void logout() {
		System.out.println("Logout the application");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.openBrowser();
		Test.login();
		Test.logout();
		t.closeBrowser();
	}

}
