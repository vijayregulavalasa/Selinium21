package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertRadioButtonEnabled {
	
	@Test
	public void isRadiobuttonEnabled() {
		
		boolean expectedValue=true;
		WebDriver driver=null;
		
		Assert.assertNotNull(driver);
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("https://www.thepancard.com/");
		
		WebElement lnk_ApplyPanCard=driver.findElement(By.linkText("Apply New PAN Card"));
		
		lnk_ApplyPanCard.click();
		boolean actualValue=driver.findElement(By.id("rblCategory_0")).isSelected();
		
		//Assert.assertEquals(actualValue, expectedValue);
		
	
		
		Assert.assertTrue(actualValue);
		
		boolean actualValue1=driver.findElement(By.id("rblCategory_1")).isSelected();
		
		//Assert.assertEquals(actualValue1, expectedValue);
		
		Assert.assertFalse(actualValue1);
		
		
		driver.quit();
	}

}
	