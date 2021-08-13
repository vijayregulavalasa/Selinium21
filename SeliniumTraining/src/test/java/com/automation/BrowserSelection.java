package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSelection {
	WebDriver driver=null;
	@Parameters({"Browser"})
	@BeforeTest
	public void browserSelection(@Optional("IE") String browser) {
		
	 
		//String browser="Chrome";
		switch (browser) {
		
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			break;
		
		case "FF":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		break;
		
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		break;

		default:
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		
			break;
		}
					
		}
	
	@Test(dataProvider = "getTestData")
	public void addCart(String userName,String password) throws InterruptedException {
		

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData(){
		
		Object[][] testData= {
				{"standard_user","secret_sauce"},
				{"standard_user","secret_sauce"}
		};
		
		return testData;
		
		/*
		 * Object[][] testData={
		 * 			{"user1","pwd","firstname","lastName"},
		 * 			{"user2","pwd",firstname","lastName"},
		 * 			{"User3","pwd","firstName","lastName}
		 * }
		 * 
		 * }
		 * Obejct[][] testdata=new Object[3][4];
		 * 
		 * testData[0][0]={"username","pwd"}
		 * testData[0][1]={"username1","pwd"}
		 * 
		 * 
		 * 
		 * */
		 
	}
	
	@DataProvider(name="TestData2")
	public Object[][] TestData2(){
		 Object[][] testdata=new Object[3][2];
		 
		 testdata[0][0]="standard_user";
		 testdata[0][1]="secret_sauce";
		 return testdata;
		
	}
	
	}

