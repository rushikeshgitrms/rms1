package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	private WebElement searchfield;

	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
	private WebElement searchbutton;

	WebDriverWait wait;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	}

	public void searchProduct(String text) {
		searchfield.sendKeys(text);
	}

	public void clickOnSearch() {
		searchbutton.click();

	}

}
