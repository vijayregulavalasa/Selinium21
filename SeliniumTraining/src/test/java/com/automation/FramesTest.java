package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		WebElement frame=driver.findElement(By.name("packageListFrame"));
		//driver.switchTo().frame("packageListFrame");
		driver.switchTo().frame(frame);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		
		driver.findElement(By.linkText("TakesScreenshot")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("Instance Methods")).click();
		//driver.switchTo().parentFrame();
		
		

	}

}
