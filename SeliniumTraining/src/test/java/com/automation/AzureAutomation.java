package com.automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AzureAutomation {

	public static WebElement element = null;
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String scrumName = JOptionPane.showInputDialog("What is your name? ");

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://dev.azure.com/AVEVA-VSTS/Dabacon%20Products/_build");

		Thread.sleep(3000);

		while (!isElementPresent()) {
			
		}

		WebElement Boards=driver.findElement(By.xpath("//a[@aria-label='Boards']"));
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Boards).perform();
		
		//WebElement sprints = (new WebDriverWait(driver,2)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		//WebElement sprints=driver.findElement(By.xpath("//a[@aria-label='Sprints']"));
		
		//actions.moveToElement(sprints);
		
		//actions.click().build().perform();
		
		actions.sendKeys(Keys.ARROW_RIGHT).perform();
		
		for(int i=0;i<4;i++) {
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(8000);
		
		WebElement task=driver.findElement(By.xpath("//div[text()='ActiveTask-IBL']"));
		task.click();
		Thread.sleep(5000);
		WebElement emailQuery=driver.findElement(By.xpath("//span[text()='Email query']"));
		emailQuery.click();
		Thread.sleep(8000);
		
		WebElement toUsers=driver.findElement(By.id("email-input-to"));
		toUsers.sendKeys("vijay.regulavalasa@aveva.com");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		
		WebElement subject=driver.findElement(By.id("email-input-subject"));
		subject.clear();
		subject.sendKeys(scrumName +"Active -Task");
		
		
		
		WebElement send=driver.findElement(By.xpath("//span[text()='Send']"));
		send.click();
		
		
		
	}

	public static boolean isElementPresent() {
		try {

			element = driver.findElement(By.xpath("//a[@aria-label='Boards']"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

}
