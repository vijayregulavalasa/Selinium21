package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.quit();
	}

}
