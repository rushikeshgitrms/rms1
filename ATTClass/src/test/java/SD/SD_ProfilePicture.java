package SD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_ProfilePicture {

	@Given("user should be at homepage")
	public void user_should_be_at_homepage() {
		System.out.println("Given statement");
	}

	@When("user clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
		System.out.println("When statement for add button");

	}

	@When("upload the image")
	public void upload_the_image() {
		System.out.println("When statement for add image");

	}

	@Then("profile should get added")
	public void profile_should_get_added() {
		System.out.println("Then statement for add profile");

	}

	@When("user clicks on edit link")
	public void user_clicks_on_edit_link() {
		System.out.println("When statement for edit button");

	}

	@When("update the image")
	public void update_the_image() {
		System.out.println("When statement for update image");

	}

	@Then("profile should get updated")
	public void profile_should_get_updated() {
		System.out.println("Then statement for update profile");

	}

	@When("user clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
		System.out.println("When statement for delete button");

	}

	@When("delete  the image")
	public void delete_the_image() {
		System.out.println("When statement for delete image");

	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Then statement for delete profile");

	}
}
