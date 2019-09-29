package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.RemoveOnePage;
import util.BrowserFactory;


public class RemoveOneTest {
	
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {
		// Starts Chrome browser, saves driver to test class
		driver = BrowserFactory.startBrowser();

		// Navigate to test site
		driver.get("http://techfios.com/test/107/");
		System.out.println("Before deleting " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		RemoveOnePage onechechBox = PageFactory.initElements(driver, RemoveOnePage.class);
		onechechBox.UserShldBeAbleToDeleteOne();
		System.out.println("After deleting " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.close();
	}
}
