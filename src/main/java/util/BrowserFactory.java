package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.BasePage;

public class BrowserFactory extends BasePage {

	// Global, usable by all methods
	static WebDriver driver;

	public static WebDriver startBrowser() {
		// Setting properties for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Create ChromeDriver object, launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Return driver to test class
		driver.get("http://techfios.com/test/107/");
		return driver;
	}
}
