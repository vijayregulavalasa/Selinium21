package com.automaton.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class LoginStepdefinition {
	WebDriver driver=null;
	
	@Given("I am in Orange HRM url")
	public void i_am_in_orange_hrm_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}
	@When("I logged in as a user")
	public void i_logged_in_as_a_user() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();

	}
	@Then("user should be logged in succesfully")
	public void user_should_be_logged_in_succesfully() {
		WebElement wecome = driver.findElement(By.id("welcome"));
		Assert.assertNotNull(wecome);
	}
	@When("I logout")
	public void i_logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@When("I logged in as a {string} user")
	public void i_logged_in_as_a_user(String userName) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@When("I logged in with below")
	public void i_logged_in_with_below(io.cucumber.datatable.DataTable dataTable) {

		List<String> list=dataTable.asList();
		driver.findElement(By.id("txtUsername")).sendKeys(list.get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(list.get(1));
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@When("I logged in with {string} {string}")
	public void i_logged_in_with(String userName, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Before
	public void OpenOrangUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}
	
	@After
	public void Logout() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	}
	
	
	/*
	 * 
	 * 
	 *         Runs Cucumber Scenarios
io.cucumber.testng.UndefinedStepException: The step 'I am in Orange HRM url' and 3 other step(s) are undefined.
You can implement these steps using the snippet(s) below:
	 * 
	 * 
	 * 
	 * 
	 * ?/
	 */

