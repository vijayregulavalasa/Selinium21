package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpaceWell {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mcsqaportal.spacewell.com/test_180/");
		Thread.sleep(12000);
		WebDriverWait wait =new WebDriverWait(driver,20);
		WebElement username=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("loginID")));
	
			username.sendKeys("AQA_testing_Soumya");
			
		WebElement password=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		password.sendKeys("SyVOD2FVEzIpFZ");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("WelcomePage"));
		WebElement calender=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Calender']")));
		calender.click();
		}

}
