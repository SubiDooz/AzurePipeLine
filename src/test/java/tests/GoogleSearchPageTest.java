package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;


public class GoogleSearchPageTest {
	
	WebDriver driver;
	
	@Test
	public void validatePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		GoogleSearchPage gspObj = new GoogleSearchPage(driver);
		gspObj.enterValInSearchBox("Azure");
		driver.close();
		
	}
	
}
