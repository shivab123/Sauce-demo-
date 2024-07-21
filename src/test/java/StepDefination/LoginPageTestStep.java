package StepDefination;

import BaseLayer.Baseclass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestStep {

	private static LoginPage loginpage;
	
	@Given("User enter URL on browser")
	public void user_enter_url_on_browser() {
	  Baseclass.initilization();
	}

	@When("User enter valid user name and password")
	public void user_enter_valid_user_name_and_password() {
	   loginpage = new LoginPage();
	   loginpage.login("standard_user", "secret_sauce");
	   
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	    loginpage.loginclick();
		
	}
}
