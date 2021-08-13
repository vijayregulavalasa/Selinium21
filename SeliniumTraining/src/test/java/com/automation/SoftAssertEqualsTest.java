package com.automation;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertEqualsTest {
@Test
	public void softAsserTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		String expectedTitle = "Apply PAN Card Online -  New Pan Card, Duplicate Pan, Changes/Corrections in Pan | ThePanCard.com";
		String actualTitle = driver.getTitle();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedTitle, actualTitle);

		softAssert.assertAll();
		driver.quit();

	}

}
