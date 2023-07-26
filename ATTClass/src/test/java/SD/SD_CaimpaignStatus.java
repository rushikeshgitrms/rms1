package SD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_CaimpaignStatus {

	@Given("user is at caimpaign page")
	public void user_is_at_caimpaign_page() {
		System.out.println("Given statement for caimpaign page");
	}

	@When("User clicks on create Caimpaign")
	public void user_clicks_on_create_caimpaign() {
		System.out.println("When statement for click on caimpaign button");

	}

	@When("User enters the information")
	public void user_enters_the_information() {
		System.out.println("When statement to enter information");
	}

	@When("Use clicks on save button")
	public void use_clicks_on_save_button() {
		System.out.println("When statement to click on save");
	}

	@Then("Caimpaign  should get created")
	public void caimpaign_should_get_created() {
		System.out.println("Then statement to create the caimpaign");
	}

	@When("User clicks on edit Caimpaign")
	public void user_clicks_on_edit_caimpaign() {
		System.out.println("When statement to edit the caimpaign");
	}

	@When("User enters the sending information")
	public void user_enters_the_sending_information() {
		System.out.println("When statement for sending information");
	}

	@When("Use clicks on schedule button")
	public void use_clicks_on_schedule_button() {
		System.out.println("When statement for scheduling");
	}

	@Then("Caimpaign  should get scheduled")
	public void caimpaign_should_get_scheduled() {
		System.out.println("When statement for scheduling");
	}

	@When("User clicks on sent Caimpaign")
	public void user_clicks_on_sent_caimpaign() {
		System.out.println("When statement for sent ");
	}

	@Then("User should see sent count")
	public void user_should_see_sent_count() {
		System.out.println("Then statement for sent");
	}
}
