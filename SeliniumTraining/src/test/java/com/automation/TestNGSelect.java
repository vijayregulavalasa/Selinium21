package com.automation;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSelect {

	WebDriver driver = null;

	@Test(enabled = false)
	public static void test1() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(priority = 2, description = "test2", enabled = false)
	public static void test2() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(priority = 1, invocationCount = 3, enabled = false)
	public static void test3() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");
		WebElement lstCars = driver.findElement(By.id("cars"));
		Thread.sleep(2000);
		Select select = new Select(lstCars);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		select.selectByValue("audi");
		select.deselectByIndex(3);
		Thread.sleep(2000);
		select.deselectByVisibleText("Opel");
		Thread.sleep(2000);
		select.deselectByValue("volvo");
		Thread.sleep(5000);
		driver.quit();

	}

	@BeforeMethod 
	public void login() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(10000);
	
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(10000);

	}

	@Test
	public void addToCart() throws Exception {

		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(10000);
		Reporter.log("AddCart");

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}

	@BeforeTest
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	
	}
	/*
	@BeforeClass
	public void beforeClass() {
		String beforeClass = JOptionPane.showInputDialog("BeforeClass? ");
	}
	@AfterClass
	public void afterClass() {
		String afterClass = JOptionPane.showInputDialog("AfterClass? ");
	}*/
	
	@BeforeSuite
	public void startTime() {
		String startTime = JOptionPane.showInputDialog("StarTime : " + System.currentTimeMillis());
	}
	
	@AfterSuite
	public void stopTime() {
		String stopTime = JOptionPane.showInputDialog("StopTime : "+ System.currentTimeMillis());
	}
	
	@Test 
	public void addToCart1() throws Exception {

		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(10000);
		Reporter.log("AddtoCart1");

	}

}
