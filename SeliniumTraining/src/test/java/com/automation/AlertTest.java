package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Show Confirm")).click();
		

		
		//driver.findElement(By.linkText("Show Alert")).click();
		
		//Exception in thread "main" org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Press a button}
		
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		
		alert.accept();
		
	
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Show Confirm")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.linkText("Show Prompt")).click();
		Thread.sleep(2000);
		
		Alert alert1=driver.switchTo().alert();
		
		alert1.sendKeys("vijay");
		alert1.accept();
		
		
		
	
	}

}
