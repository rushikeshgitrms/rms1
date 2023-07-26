package SD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_BackgroundWithScenarioOutline {

	@Given("user should be at profile page")
	public void user_should_be_at_profile_page() {
		System.out.println("Given statement");
	}

	@When("user enter firstname as {string}")
	public void user_enter_firstname_as(String fname) {
		System.out.println("When statement for firstname is " + fname);

	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String lname) {
		System.out.println("When statement for lastname " + lname);

	}

	@When("user enters city name as {string}")
	public void user_enters_city_name_as(String city) {
		System.out.println("When statement " + city);

	}

	@Then("profile should get created")
	public void profile_should_get_created() {
		System.out.println("Then statement");

	}

}
