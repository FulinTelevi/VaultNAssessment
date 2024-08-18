package com.trello.steps;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class CreateListsSteps extends CommonMethods {

	@Given("User clicks VaultN board")
	public void user_clicks_vault_n_board() {
	    
		wait(2);
		
		click(userHomePage.openTheBoardButton);
		wait(2);
	}
	@Given("User clicks add another list button")
	public void user_clicks_add_another_list_button() {
		
	    click(boardPage.addAnotherListButton);
	    wait(2);
	}
	@Given("User enters list name as Backlog in the board and click add list button")
	public void user_enters_list_name_as_backlog_in_the_board_and_click_add_list_button() {

		sendText(boardPage.listNameBox,"Backlog");
		click(boardPage.AddListButton);
		wait(2);
	}
	@Given("User enters list name as ToDo in the board and click add list button")
	public void user_enters_list_name_as_to_do_in_the_board_and_click_add_list_button() {
	    
		sendText(boardPage.listNameBox,"ToDo");
		click(boardPage.AddListButton);
		wait(2);
	}
	@Given("User enters list name as Doing in the board and click add list button")
	public void user_enters_list_name_as_doing_in_the_board_and_click_add_list_button() {
	   
		sendText(boardPage.listNameBox,"Doing");
		click(boardPage.AddListButton);
		wait(2);
	}
	@Given("User enters list name as Testing in the board and click add list button")
	public void user_enters_list_name_as_testing_in_the_board_and_click_add_list_button() {
	    
		sendText(boardPage.listNameBox,"Testing");
		click(boardPage.AddListButton);
		wait(2);
	}
	@Given("User enters list name as Done in the board and click add list button")
	public void user_enters_list_name_as_done_in_the_board_and_click_add_list_button() {
	   
		sendText(boardPage.listNameBox,"Done");
		click(boardPage.AddListButton);
		wait(2);
		
		click(boardPage.cancelAddListButton);
		wait(2);
	}
	
	
}
