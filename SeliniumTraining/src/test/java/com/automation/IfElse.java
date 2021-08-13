package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Chrome";
		System.out.println("start" );
		
		WebDriver driver=null;
		
		if(input.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();
		System.out.println("End of program");

	}

}
