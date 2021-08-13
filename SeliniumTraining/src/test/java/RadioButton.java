import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	WebElement lnk_NewPanCard = null;
	public WebDriver driver = null;
	 By linkby = By.linkText("Apply New PAN Card");
	 By RadioBy = By.id("");


	public  boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RadioButton rd=new RadioButton();
		rd.driver = new ChromeDriver();
		rd.driver.manage().window().maximize();
		rd.driver.get("https://www.thepancard.com/");

		System.out.println("Page title is " + rd.driver.getTitle());
		System.out.println("Current url is " + rd.driver.getCurrentUrl());
		rd.driver.navigate().back();
		rd.driver.navigate().forward();
		rd.driver.navigate().refresh();

		if (rd.isElementPresent(rd.linkby)) {
			rd.driver.findElement(rd.linkby).click();

		}

		WebElement RBTN_Army = rd.driver.findElement(By.cssSelector("input[value='3'][type='radio']"));
		System.out.println("Status of radio button " + RBTN_Army.isSelected());
		RBTN_Army.click();
		Thread.sleep(2000);

		System.out.println("status of radio button after click " + RBTN_Army.isSelected());

		Thread.sleep(2000);
		rd.driver.quit();

		
		
	}

}
