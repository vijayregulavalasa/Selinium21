package com.automation;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class)
				
				
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/watch?v=WcK88pFd2Lk']")).click();
		
		
		
		

	}

}
