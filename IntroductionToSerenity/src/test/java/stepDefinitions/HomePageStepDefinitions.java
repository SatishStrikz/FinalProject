package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import steps.HomePageSteps;

public class HomePageStepDefinitions extends PageObject{

	@Steps
	HomePageSteps homepagesteps;


	@Given("User is landed on the orange hrm login page")
	public void user_is_landed_on_the_orange_hrm_login_page() {
	    open();
	}

	@Then("user enters username {string}")
	public void user_enters_username(String userName) {
	    // Write code here that turns the phrase above into concrete actions
	    homepagesteps.enterUsername(userName);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		 homepagesteps.enterPassword(password);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		homepagesteps.clickLogin();
	 
	}
	@Then("user validate quick launch text {string}")
	public void user_validate_quick_launch_text(String quickLaunchText) throws InterruptedException {
	    homepagesteps.user_validate_quick_launch_text(quickLaunchText);
	}
	}

