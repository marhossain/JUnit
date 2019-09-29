package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import page.ToggleAllPage;
import util.BrowserFactory;


public class ToggleAllTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {
		// Starts Chrome browser, saves driver to test class
		driver = BrowserFactory.startBrowser();
		
		// Navigate to test site
		driver.get("http://techfios.com/test/107/");

		ToggleAllPage toggleAll  = PageFactory.initElements(driver, ToggleAllPage.class);
			
		// Validation		
		toggleAll.ToToggleAll();
		Boolean result = toggleAll.isToggleAllCheckBoxSelected();
		System.out.println("All select boxes are checked"  +  result);
			
		if(!result) {
			toggleAll.ToToggleAll();
			Assert.assertTrue("Box selected", result);
		}
		
		Assert.assertTrue("All boxes are selected", toggleAll.checkAllBoxesIfSelected());
		WebElement checkbox = driver.findElement(By.name("allbox"));
		Assert.assertEquals(true, checkbox.isSelected());
		
		driver.close();
	} 
}
