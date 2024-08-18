package com.trello.steps;

import org.junit.Assert;

import com.trello.utils.CommonMethods;
import com.trello.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTrelloWithValidCredantialsSteps extends CommonMethods {

	@Given("User navigates to trello website and click login button")
	public void user_navigates_to_trello_website_and_click_login_button() {
	    
		click(homePage.fLoginButton);
		wait(2);
	}
	@Given("User enters his email in emailbox and click continue button")
	public void user_enters_his_email_in_emailbox_and_click_continue_button() {
	    
		sendText(homePage.userNameBox,ConfigsReader.getProperty("username"));
		click(homePage.continueButton);
		wait(2);
		
	}
	@Given("User enters his password in passwordbox and click Log in button")
	public void user_enters_his_password_in_passwordbox_and_click_log_in_button() {
	    
		sendText(homePage.passwordBox,ConfigsReader.getProperty("password"));
		click(homePage.sLoginButton);
		wait(5);
	}
	@Then("User verifies that he is on his account page.")
	public void user_verifies_that_he_is_on_his_account_page() {
	    
		Assert.assertTrue(userHomePage.accountName.getAttribute("title").contains(ConfigsReader.getProperty("accountname")));
	}

}
