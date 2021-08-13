package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		Thread.sleep(3000);
		// different xpath's
		//driver.findElement(By.id("chkavailabilityBtn")).click();
		//driver.findElement(By.name("chkavailabilityBtn")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();
		//driver.findElement(By.xpath("//input[@title='Search']")).click();
		//driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
		
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		//driver.findElement(By.xpath("//input[@id='searchBtn']]")).click();
		//driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.findElement(By.xpath("//input[@class='chkavailabilityBtn']")).click();
		
		
		driver.findElement(By.cssSelector("input[id='searchBtn']")).click();
		
	
		
		
		Thread.sleep(3000);
		//driver.quit();
		
	//	/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]
		
	//	<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		//input[@title='Search']
		
		//input[@value='Check Availability']
		
		//input[@type='button']
		
		//input[@name='searchBtn']
		
		
		//Cssselector
		
	//          	input[id='searchBtn']];
	
	}

}
