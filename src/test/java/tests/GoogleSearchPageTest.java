package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;


public class GoogleSearchPageTest {
	
	WebDriver driver;
	
	@Test
	public void validatePage() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		//options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		//options.addArguments("--headless");
		
		
		driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		GoogleSearchPage gspObj = new GoogleSearchPage(driver);
		gspObj.enterValInSearchBox("Azure");
		driver.close();
		
	}
	
}
