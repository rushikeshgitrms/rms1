package SD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_login {

	@Given("User is at the login screen")
	public void preconditions() {
		System.out.println("Preconditions for Given");
	}

	@When("User enters username")
	public void enterUsername() {
		System.out.println("Entering username");
	}

	@And("User enters password")
	public void enterPassword() {
		System.out.println("Entering password");
	}

	@And("User clicks on login button")
	public void clickOnLogin() {
		System.out.println("Clicking on Login");
	}

	@Then("User should get logged in")
	public void validateLogin() {
		System.out.println("User has logged in");
	}

}
