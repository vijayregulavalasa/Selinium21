package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Safari";
		System.out.println("Start of the program");
		WebDriver driver = null;

		if (input.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (input.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (input.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}else {
			System.out.println("invalid browser");
			System.exit(1);
		}
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();

		System.out.println("End of program");
		
		//Exception in thread "main" java.lang.NullPointerException

	}

}
