package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.in/");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("nameStateList")).sendKeys("Telangana");
		Thread.sleep(2000);
		driver.findElement(By.id("nameStateList")).sendKeys("Bihar");
		// Exception in thread "main"
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//option[text()='Volvo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Opel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Audi']")).click();
		
		actions.keyUp(Keys.CONTROL).perform();
		
	
	}

}
