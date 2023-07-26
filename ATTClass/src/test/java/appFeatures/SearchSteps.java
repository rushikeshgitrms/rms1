package appFeatures;

import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchSteps {

	SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

	@When("User enters product name as {string}")
	public void user_enters_product_name_as(String prdname) {

		searchPage.searchProduct(prdname);
	}

	@When("click on search button")
	public void click_on_search_button() {

		searchPage.clickOnSearch();
	}
}
