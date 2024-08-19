package com.trello.steps;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class DeleteTheBoardRightAfterCloseSteps extends CommonMethods{

	@Given("User clicks permanently delete button")
	public void user_clicks_permanently_delete_button() {
	   
		click(boardPage.permanenetlyDeleteBoardButton);
		wait(2);
	}
	@Given("User confirms deleting action by clicking delete button")
	public void user_confirms_deleting_action_by_clicking_delete_button() {
	    
		click(boardPage.confirmButtonForDeleting);
		wait(2);
	}
}
