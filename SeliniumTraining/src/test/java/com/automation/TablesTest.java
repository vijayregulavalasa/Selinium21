package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		List<WebElement> tables = driver.findElements(By.xpath("//table"));
		System.out.println(tables.size());
		//List<WebElement> rows=driver.findElements(By.xpath("//table[@id='example']//tr"));  all rowns in table // use
		List<WebElement> dataRows=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		
		System.out.println("#Rows count " +dataRows.size());
		
	List<WebElement> Columns=driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
	System.out.println("#Columns count " +Columns.size());
	
	//to get all row data
	
	WebElement table=driver.findElement(By.xpath("//table[@id='example']"));
	System.out.println(table.getText());
	
	// to get all row content
	WebElement tableFirstRow=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]"));
	System.out.println(tableFirstRow.getText());
	List<WebElement> tableFirstColumns=driver.findElements(By.xpath("//table[@id='example']/tbody//td[3]"));
	
	for(WebElement column:tableFirstColumns) {
	System.out.println(column.getText());
	}
	
	////Celldata
	WebElement cell=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[4]"));
	System.out.println(" Colum data :  " + cell.getText());
	
	
	//Get each row content
	
	
	for(int i=1;i<=dataRows.size();i++) {
		String rowContent=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i +"]")).getText();
		System.out.println("Row content "+ i +":    "+ rowContent );
	}
	
	//try sorting columns and validate they are sorted or not
	
	
	
	List<WebElement> allCellData=driver.findElements(By.xpath("//table[@id='example']/tbody//tr/td"));
	for(WebElement cellData:allCellData) {
		if(cellData.getText()=="London") {
			System.out.println("London is represent in the table");
		}
	}
		//driver.quit();
		
	}

}
