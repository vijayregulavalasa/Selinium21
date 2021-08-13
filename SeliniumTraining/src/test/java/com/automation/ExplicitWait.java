package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://fast.com/");

		// driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("show-more-details-link")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("show-more-details-link")));

		driver.findElement(By.id("show-more-details-link")).click();

		// Wait for alert using explicit wait-NO such Alert exception

		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_settimeout");
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait1=new WebDriverWait(driver, 300);
		wait1.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
		
//////org.openqa.selenium.NoAlertPresentException: no such alert
				
				driver.navigate().to("https://www.havells.com/");
				WebDriverWait wait2=new WebDriverWait(driver, 300);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/homepagebanners/lighting_main_banner.html']")));
				
				//can use is element clickable as well
				
				driver.findElement(By.xpath("//img[@src='/homepagebanners/lighting_main_banner.html']")).click();
	}

}
