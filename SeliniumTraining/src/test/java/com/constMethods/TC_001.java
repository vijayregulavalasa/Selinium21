package com.constMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {
	
	public static void Transaction() {
		System.out.println("Transactions");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.openBrowser();
		Test.login();
		TC_001.Transaction();
		Test.logout();
		t.closeBrowser();
	}

}
