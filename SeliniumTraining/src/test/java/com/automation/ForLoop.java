package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");

		for (int index = 2; index <= 3; ) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/search?q=webdrivermanager");
			index++;
			driver.quit();
		}

		System.out.println("end");

	}

}
