package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AzureSprintTasks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.azure.com/AVEVA-VSTS/Dabacon%20Products");
		Thread.sleep(60000);
		WebElement boards=driver.findElement(By.xpath("//a[@aria-label='Boards']"));
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(boards).perform();
	
		
		
	}
}
