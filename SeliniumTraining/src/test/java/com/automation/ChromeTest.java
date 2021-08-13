package com.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		String windowTitle=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println("The page title is  " + windowTitle);
		System.out.println("Url is "+ url);
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(3000);
		driver.navigate().to(new URL("https://my.naukri.com/account/register/basicdetails"));
		Thread.sleep(3000);
		driver.quit();
		
		driver.close();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to("url");
		driver.navigate().to(new URL("to"));
		driver.get(url);
		driver.getTitle();
		
		
	
		 
		
	


	}

}
