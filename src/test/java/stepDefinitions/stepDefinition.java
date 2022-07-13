package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on NetBanking  landing page$")
	public void user_is_on_netbanking_landing_page() {

		System.out.println("User is on NetBanking  landing page");

	}


    @When("^User login into application with  \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("UserName is printed "+strArg1);
        System.out.println("UserName is printed "+strArg2);
    }

	@Then("^Home Page is populated$")
	public void home_page_is_populated() {

		System.out.println("Validated Home Page");

	}

	 @And("^cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String strArg) {
		 
		 //Code to validate  if cards should be displayed or not

		System.out.println("Validated cards are displayed" + strArg);

	}

}