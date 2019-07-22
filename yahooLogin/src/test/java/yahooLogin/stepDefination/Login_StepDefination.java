package yahooLogin.stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefination {
	
	@Given("^User navigate to the <\"([^\"]*)\">$")
	public void user_navigate_to_the(String arg1) throws Throwable {
		System.out.println("Login to the Application");
	}

	@When("^User clicks on the login portal$")
	public void user_clicks_on_the_login_portal() throws Throwable {
		System.out.println("Login to the New Tour");
	}

	@And("^User enters the <\"([^\"]*)\"> username$")
	public void user_enters_the_username(String arg1) throws Throwable {
		System.out.println("User Enters the username");
	}

	@And("^User enters the <\"([^\"]*)\"> password$")
	public void user_enters_the_password(String arg1) throws Throwable {
	   
	System.out.println("User Enters the password");
	}
	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("User clicks on the Login Button");
	}


	
	

}
