package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@data-csa-c-slot-id=\"nav_cs_0\"]")
	private WebElement summerdeal;

	@FindBy(xpath = "//*[@id=\"nav-cart123\"]")
	private WebElement carticon;

	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
	private WebElement accountsignin;

	@FindBy(xpath = "//*[@class=\"nav-action-signin-button\"]/parent::div[@id=\"nav-flyout-ya-signin\"]")
	private WebElement signinhoverbutton;

	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	private WebElement emailfield;

	@FindBy(xpath = "//input[@id=\"continue\"]")
	private WebElement continuebutton;

	@FindBy(xpath = "//*[@name=\"password\"]")
	private WebElement passwordfield;

	@FindBy(xpath = "//*[@id=\"signInSubmit\"]")
	private WebElement finalsigninbutton;
	
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	}

	public String getTitleOfPage() {
		String title = driver.getTitle();
		return title;
	}

	public boolean verifyCart() {
		boolean isdisplay = carticon.isDisplayed();
		return isdisplay;
	}

	public void goToSignInPage() {
		Actions act = new Actions(driver);
		act.moveToElement(accountsignin).perform();
		signinhoverbutton.click();

	}

	public void enterUserName(String uname) {
		emailfield.sendKeys(uname);
		continuebutton.click();
	}

	public void finalSignIn(String pwd) {
//		wait.until(ExpectedConditions.visibilityOf(passwordfield));
		passwordfield.sendKeys(pwd);
		finalsigninbutton.click();
	}
	
	public void enterToSummerDeals()
	{
		wait.until(ExpectedConditions.visibilityOf(summerdeal));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", summerdeal);
//		summerdeal.click();
	}
	
	
	

}
