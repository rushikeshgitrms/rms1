package SD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ordersSteps {
	
	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   System.out.println("Given statement for login");
	}

	@When("User should be at the order page")
	public void user_should_be_at_the_order_page() {
		System.out.println("When ststement for order page");
	}

	@When("User clicks on past order button")
	public void user_clicks_on_past_order_button() {
		System.out.println("When ststement for past order page");
	}

	@Then("User should be able to see past order information")
	public void user_should_be_able_to_see_past_order_information() {
		System.out.println("Then ststement for past order page");
	}

	@When("User clicks on the current order button")
	public void user_clicks_on_the_current_order_button() {
		System.out.println("When ststement for current order page");
	}

	@Then("User should be able to see the current order information")
	public void user_should_be_able_to_see_the_current_order_information() {
		System.out.println("Then ststement for current order page");

	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("When ststement for cancelled order page");

	}

	@Then("User should be able to see the canceleed order information")
	public void user_should_be_able_to_see_the_canceleed_order_information() {
		System.out.println("Then ststement for cancelled order page");

	}

}
