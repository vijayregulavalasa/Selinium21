package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean status=true;
		System.out.println("start of the program");
		
		while(status) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/search?q=webdrivermanager");
			System.out.println("while");
			status=false;
		}
		
		System.out.println("End of program");

	}

}
