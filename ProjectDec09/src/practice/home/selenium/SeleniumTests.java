package practice.home.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTests {
	
	@Test
	public  void Main() {
		
		System.setProperty("webdriver.gecko.driver", "/home/jose/Downloads/Selenium/geckodriver-v0.21.0-linux64/geckodriver");
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("initialized driver");
		driver2.get("https://www.facebook.com");

	}
}