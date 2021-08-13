package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		System.out.println("Page title "+ driver.getTitle());
		System.out.println("current url " + driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		
		WebElement CKB_agree=driver.findElement(By.xpath("//input[@name='agreeproof'][@type='checkbox']"));
		
		System.out.println("status "+ CKB_agree.isEnabled());
		
		System.out.println("status "+ CKB_agree.getAttribute("checked"));
		CKB_agree.click();
		
		boolean isselected=CKB_agree.isSelected();
		System.out.println(isselected);
		System.out.println("status "+ CKB_agree.getAttribute("checked"));
		
		driver.findElement(By.name("proof_identity")).sendKeys("Passport");
		
		
		
		
		
		
		/*
		 * Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //[@name='agreeproof'][@type='checkbox'] because of the following error:
SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//[@name='agreeproof'][@type='checkbox']' is not a valid XPath expression.
		 * 
		 * 
		 * */
		 
		

	}

}
