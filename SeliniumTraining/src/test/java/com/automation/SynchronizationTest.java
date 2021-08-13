package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/");
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Login")).click();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//explicit wait or webdriverwait
		
		WebDriverWait wait=new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("vijay");
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
	//	driver1.navigate().to("https://fast.com/");
		driver1.get("https://fast.com/");
		driver1.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebDriverWait wait1=new WebDriverWait(driver1, 50);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("show-more-details-link")));
		driver1.findElement(By.id("show-more-details-link")).click();
	}

}
