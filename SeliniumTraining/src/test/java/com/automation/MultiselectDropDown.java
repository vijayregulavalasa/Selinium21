package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.in/");


		// single dropdown
		
		 driver.findElement(By.id("continue")).click(); 
		 WebElement DD_State=driver.findElement(By.id("nameStateList")); Thread.sleep(2000);
		 
		 Select sl1=new Select(DD_State); 
		 boolean dropdownMultiple=sl1.isMultiple();
		  
		 System.out.println(dropdownMultiple);
		 sl1.selectByValue("S01");
		 

		 Thread.sleep(2000);
		 sl1.selectByVisibleText("Telangana");
		 List<WebElement> listSelected=sl1.getAllSelectedOptions();

		 for(WebElement e:listSelected) {
			 System.out.println("Selected option "+ e.getText());
		 }
		 
		 List<WebElement> listAllOptions=sl1.getOptions();
		 
		 for(WebElement e:listAllOptions) {
			 System.out.println("All options " + e.getText());
		 }
		
		
/*
		
		// multipledropdown

		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebElement Iframe = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(Iframe);

		WebElement DD_cars = driver.findElement(By.name("cars"));

		Select sl2 = new Select(DD_cars);
		boolean multiCheck = sl2.isMultiple();
		System.out.println("Cars drop down is " + multiCheck);
		sl2.selectByIndex(0);
		sl2.selectByValue("audi");
		sl2.selectByVisibleText("Saab");
		//DD_cars.sendKeys("Saab");
		
		List<WebElement> listAllOptions=sl2.getOptions();
		
		for(WebElement element:listAllOptions ) {
			System.out.println("Available options "+ element.getText());
		}
		
		Thread.sleep(2000);
		int sizeSelectedOption=sl2.getAllSelectedOptions().size();
		System.out.println("Size of selected option " + sizeSelectedOption);
		List<WebElement> listSelectedOptions=sl2.getAllSelectedOptions();
		
		for(WebElement e: listSelectedOptions) {
			System.out.println(e.getText());
		}
		
		
		//Deselect options
		
		//sl2.deselectAll();
		sl2.deselectByIndex(0);
		Thread.sleep(2000);
		sl2.deselectByValue("audi");
		//sl2.deselectByVisibleText("");
		
		
		 */
		 
	

	}

}
