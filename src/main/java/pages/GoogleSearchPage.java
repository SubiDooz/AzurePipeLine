package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	public void enterValInSearchBox(String val) {
		searchBox.sendKeys(val);
	}

}
