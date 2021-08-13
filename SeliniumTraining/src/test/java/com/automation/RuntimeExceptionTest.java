package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
		System.out.println("start of the program");
		int[] array=new int[5];
		try {
			System.out.println(array[1]);

			System.out.println(array[5]);
			
			System.out.println(array[2]);
			System.out.println(array[3]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally");
		}

		System.out.println("End");

	
	
	
	try {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.thepancard.com/");
		driver.findElement(By.linkText("dkdd")).click();
		
		
	}catch(Exception e) {
		System.out.println(e.toString());
		driver.quit();
		System.out.println("close the driver");
	}
		/*
	catch(ArrayIndexOutOfBoundsException e){
		This is code will not be executed
	}
	} */
	
	finally{
		System.out.println("finally");
	}

}
	
}
