package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement interestRate = driver.findElement(By.id("loaninterest"));
		interestRate.sendKeys("54");
		Thread.sleep(2000);
		interestRate.clear();
		// Actions actions=new Actions(driver);
		// actions.sendKeys(interestRate,"89").perform();
		
		//send value using javascript

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('loaninterest').value=12");
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=5520", interestRate);
		
		//click button using javascript editor
		driver.navigate().to("https://www.tsrtconline.in/oprs-web/");
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("validateBookingSearch()");
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		//scroll and make element visibile using javascript
		
		driver.navigate().to("https://www.selenium.dev/");
		
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		js2.executeScript("document.getElementsByName('submit')[0].scrollIntoView()");
		
		//click using javascriptexecutor
		js2.executeScript("document.getElementsByName('submit')[0].click()");
		
		
		//highlight element using javascript executor
		
		driver.navigate().to("https://www.thepancard.com/newpancard.php");
		Thread.sleep(2000);
		JavascriptExecutor js3= (JavascriptExecutor) driver;
		js3.executeScript("document.getElementsByName('DOB')[0].style.background='red'");
		js3.executeScript("document.getElementsByName('DOB')[0].style.border='5px solid blue'");
		js3.executeScript("document.getElementsByName('DOB')[0].style.border='dotted green'");

	
		
	}

}
