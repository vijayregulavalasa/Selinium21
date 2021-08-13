package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebElement txtbx_DOB=null;

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		//driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("Page Title is  "+ title);
		System.out.println("Current rul is " + driver.getCurrentUrl());
		WebElement lnk_NewPanCard=driver.findElement(By.linkText("Apply New PAN Card"));
		
		if(lnk_NewPanCard.isDisplayed())
			lnk_NewPanCard.click();
		else
			System.out.println("Link is not displayed");
		
		//txtbx_DOB= driver.findElement(By.xpath("//input[@type='text'][@placeholder='DD/MM/YYYY']"));
		
		txtbx_DOB= driver.findElement(By.cssSelector("input[name='DOB']"));
		
		System.out.println("Text box display is " + txtbx_DOB.isDisplayed());
		System.out.println("Text box is enabled " + txtbx_DOB.isEnabled());
		
		txtbx_DOB.sendKeys("11/08/1989");
		
		
		Thread.sleep(2000);
		System.out.println("Text box value " + txtbx_DOB.getAttribute("value"));
		txtbx_DOB.clear();
		Thread.sleep(2000);
		driver.quit();
		
		//isdisplayed checks whether element is displayed or not in webpage even after element is attached to DOM
		

	}

}
