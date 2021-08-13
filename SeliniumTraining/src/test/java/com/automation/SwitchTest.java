package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "IE";
		WebDriver driver = null;

		switch (input) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		}
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();

	}

}
