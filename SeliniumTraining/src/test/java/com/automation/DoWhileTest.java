package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		boolean status=false;

		do {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/search?q=webdrivermanager");
			driver.quit();
		} while (status);

	}

}
