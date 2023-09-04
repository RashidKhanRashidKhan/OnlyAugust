package stepsDefinition;

import bases.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.LoginPage;

public class LoginSteps extends ReusableMethods {
	
	
	LoginPage K=new LoginPage();
	
	@Given("Go to login page")
	public void go_to_login_page() {
	   
		K.go_to_login_page();
		
	}

	
	@When("Fill valid user name {string}")
	public void fill_valid_user_name(String userName) {
	    K.fill_valid_user_name(userName);
		
		
	}

	@When("Fill valid password {string}")
	public void fill_valid_password(String password) {
	    K.fill_valid_password(password);
		
		
	}
	
	/*
	 * @When("Fill valid user name") public void fill_valid_user_name() {
	 * 
	 * K.fill_valid_user_name();
	 * 
	 * }
	 * 
	 * @And("Fill valid password") public void fill_valid_password() {
	 * 
	 * K.fill_valid_password();
	 * 
	 * 
	 * }
	 */

	@Then("Click on login button")
	public void click_on_login_button() {

    K.click_on_login_button();
		
		
	}
	
	

	
	
	
	
	
	
	

}
