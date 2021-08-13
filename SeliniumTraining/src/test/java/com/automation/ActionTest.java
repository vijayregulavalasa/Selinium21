package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest {
	Actions actions = null;

	public void actionClick(WebElement webElement, WebDriver driver) throws InterruptedException {
		actions = new Actions(driver);
		actions.click(webElement).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	public void actionDoubleClick(WebElement webElement, WebDriver driver) throws InterruptedException {
		actions = new Actions(driver);
		Thread.sleep(5000);
		;
		actions.doubleClick(webElement).build().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ActionTest actionTest = new ActionTest();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame(0);
		WebElement lnk = driver.findElement(By.xpath("//button[text()='Try it']"));
		/*
		 * Actions actions=new Actions(driver); actions.click(lnk).perform();
		 * //actions.click(lnk).build().perform();
		 */
		// actionTest.actionClick(lnk, driver);

		// double click

		/*
		 * 
		 * driver.navigate().to("https://api.jquery.com/dblclick/");
		 * driver.switchTo().frame(0); WebElement
		 * divTag=driver.findElement(By.tagName("div"));
		 * 
		 * actionTest.actionDoubleClick(divTag, driver);
		 */
		/*
		 * Actions actions1=new Actions(driver); Thread.sleep(5000);
		 * actions1.doubleClick(divTag).build().perform();
		 * 
		 */

		// Drag and drop

		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		// actions.dragAndDrop(drag, drop).build().perform();

		// click hold and release
		actions.clickAndHold(drag).perform();
		actions.release(drop).perform();

		driver.navigate().to("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("\r\n" + "//div[@id='slider']/span"));
		// actions.dragAndDropBy(slider, 100, 0).perform();

		WebElement sliderBase = driver.findElement(By.id("slider"));
		int size = sliderBase.getSize().getWidth();

		actions.dragAndDropBy(slider, size, 0).perform();
		Thread.sleep(3000);
		actions.dragAndDropBy(slider, -size, 0).perform();

		driver.navigate().to("https://www.dtdc.in/");
		driver.findElement(By.id("closebutton")).click();
		Thread.sleep(2000);
		WebElement tracking = driver.findElement(By.linkText("Tracking"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(tracking).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("E-Tracker")).click();

		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rightClick).perform();

		driver.navigate().to("https://www.goibibo.com/");
		Thread.sleep(3000);
		Actions actions1 = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		
		driver.navigate().to("https://www.tsrtconline.in/oprs-web/");
		WebElement bus=driver.findElement(By.name("fromPlaceName"));
		Actions actions2=new Actions(driver);
		actions2.sendKeys(bus,"HYD").perform();
		Thread.sleep(2000);
		actions2.sendKeys(Keys.ENTER).perform();
		
		
	}

}
