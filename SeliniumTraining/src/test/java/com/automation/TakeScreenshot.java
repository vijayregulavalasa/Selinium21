package com.automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thepancard.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"D:\\Selenium\\ScreenshotFolder\\" + "Screenshot_" + new Date().getTime() + ".JPEG");
		// FileHandler.copy(source, Destination);

		driver.navigate().to("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		Thread.sleep(2000);

		// Take full screeenshot
		WebElement search = driver.findElement(By.name("q"));
		Shutterbug.shootPage(driver, Capture.VIEWPORT).save("D:\\Selenium\\ScreenshotFolder\\");
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save("D:\\Selenium\\ScreenshotFolder\\");
		Shutterbug.shootElement(driver, search).save("D:\\Selenium\\ScreenshotFolder\\");

	}
	

}
