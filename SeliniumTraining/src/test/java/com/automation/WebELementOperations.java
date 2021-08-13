package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebELementOperations {

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
		
		txtbx_DOB.sendKeys("11/08/1989");
		
		
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
		//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Apply New PAN Card"}
	//org.openqa.selenium.InvalidSelectorException: invalid selector: An invalid or illegal selector was specified
	
	}

}
