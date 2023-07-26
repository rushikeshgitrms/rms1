package SD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_loginWithData {

	@When("User enters username as  {string}")
	public void user_enters_username_as(String usr) {
		System.out.println("entering username"+usr);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pwd) {
		System.out.println("entering password" +pwd);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("click on submit button");
	}

	@Then("User should redirect to homepages")
	public void user_should_redirect_to_homepages() {
		System.out.println("redirected to homepage");
	}
}
