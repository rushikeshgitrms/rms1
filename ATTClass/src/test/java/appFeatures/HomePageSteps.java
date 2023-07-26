package appFeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());

	@Given("User is at landing page")
	public void user_is_at_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://amazon.in");
	}

	@Then("page title should conatins {string}")
	public void page_title_should_conatins(String titleString) {

		String title = homepage.getTitleOfPage();
		boolean ispresent = title.contains(titleString);

		Assert.assertTrue(ispresent);
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {

		boolean isdisplay = homepage.verifyCart();
		Assert.assertTrue(isdisplay);

	}

	@When("User click on summer section deal")
	public void user_click_on_summer_section_deal() {

		homepage.enterToSummerDeals();
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		homepage.goToSignInPage();
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String uname) {

		homepage.enterUserName(uname);
	}

	@When("User enters password as {string} with Sign in")
	public void user_enters_password_as_with_sign_in(String pwd) {

		homepage.finalSignIn(pwd);
	}

	

}
