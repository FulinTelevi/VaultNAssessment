package com.trello.steps;

import org.openqa.selenium.WebElement;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class DeleteTheBoardSteps extends CommonMethods {

	@Given("User clicks -view closed boards- button")
	public void user_clicks_view_closed_boards_button() {
	    
		click(workspacePage.viewClosedBoardsButton);
		wait(2);
	}
	
	@Given("User clicks delete button for VaultN Board")
	public void user_clicks_delete_button_for_vault_n_board() {
	    
		for (int i = 0; i < workspacePage.closedBoardsList.size(); i++) {
            WebElement boardElement = workspacePage.closedBoardsList.get(i);
            String currentBoardName = boardElement.getText();

            if (currentBoardName.equals("VaultN")) {
                WebElement deleteButton = workspacePage.buttonsForClosedBoards.get(i+1);
                deleteButton.click();
                break;
            }
        }
		
		wait(2);

	}
	
	@Given("User confirms deleting action")
	public void user_confirms_deleting_action() {
	   
		click(workspacePage.confirmButtonForDeleteTheBoard);
		wait(5);
	}
}
