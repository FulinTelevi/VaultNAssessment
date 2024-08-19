package com.trello.steps;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class CreateBoardSteps extends CommonMethods {

	@Given("User clicks create button on the user homepage")
	public void user_clicks_create_button_on_the_user_homepage() {
		
	    click(userHomePage.fCreateButton);
	    wait(2);
	}
	@Given("User clicks Create Board button")
	public void user_clicks_create_board_button() {
		
	    click(userHomePage.createBoardButton);
	    wait(2);
	}
	@Given("User enters board name into the board title box")
	public void user_enters_board_name_into_the_board_title_box() {
	    
		sendText(userHomePage.boardTitleBox,"VaultN");
		wait(2);
	}
	@Given("User clicks create button")
	public void user_clicks_create_button() {
	    
		click(userHomePage.sCreateButton);
		wait(3);
		
	}



}
