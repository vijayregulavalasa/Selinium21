package com.automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWIndows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String firstWindow=null;
		
		driver.manage().timeouts().pageLoadTimeout(600, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://smartbear.com/product/testcomplete/overview/");
		driver.findElement(By.partialLinkText("Login")).click();
		firstWindow=driver.getWindowHandle();
		driver.findElement(By.linkText("CrossBrowserTesting")).click();
		
		
		Set<String> windowHandles=driver.getWindowHandles();
		
		for(String winHandle:windowHandles) {
		System.out.println(winHandle);
		driver.switchTo().window(winHandle);
		System.out.println(driver.getTitle());
			
			if(driver.switchTo().window(winHandle).getTitle().equals("CrossBrowserTesting App")) {
				break;
			}
		}

		driver.findElement(By.id("inputEmail")).sendKeys("vijay"); 
		
		driver.switchTo().window(firstWindow);
		//driver.switchTo().window("CrossBrowserTesting App");  ////org.openqa.selenium.NoSuchWindowException: no such window
		
	}

}
