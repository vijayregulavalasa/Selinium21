package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_DeleselctionTest {

	@Test
	public static void deselectionTest() throws InterruptedException {
		// TODO Auto-generated method stub
		
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
			driver.switchTo().frame("iframeResult");
			WebElement lstCars = driver.findElement(By.id("cars"));
			Thread.sleep(2000);
			Select select = new Select(lstCars);
			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByVisibleText("Opel");
			Thread.sleep(2000);
			select.selectByValue("audi");
			select.deselectByIndex(3);
			Thread.sleep(2000);
			select.deselectByVisibleText("Opel");
			Thread.sleep(2000);
			select.deselectByValue("volvo");
			Thread.sleep(5000);
			driver.quit();
			
			
	}

}
