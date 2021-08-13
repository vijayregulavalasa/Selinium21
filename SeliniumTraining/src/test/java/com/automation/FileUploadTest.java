package com.automation;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		// One Way
		// driver.findElement(By.id("file_upload")).sendKeys("D:\\InterviewDocuments\\UploadFiles\\Resume.docx");

			///other way if type is not file for weblement
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		StringSelection ss=new StringSelection("D:\\InterviewDocuments\\UploadFiles\\Resume.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		for(int i=1;i<=2;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);	
		}

		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
