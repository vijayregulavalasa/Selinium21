package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinkbyText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/?gclid=EAIaIQobChMI45-Npubq8QIVj8EWBR0zmQ-_EAAYASAAEgL6yvD_BwE");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		driver.findElement(By.partialLinkText("New PAN Card")).click();

	}

}
