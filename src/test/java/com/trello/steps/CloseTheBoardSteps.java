package com.trello.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CloseTheBoardSteps extends CommonMethods{

	@Given("User clicks on the ... icon at the top right of the board page")
	public void user_clicks_on_the_icon_at_the_top_right_of_the_board_page() {
	   
		click(boardPage.menuIconButton);
		wait(2);
	}
	
	@Given("User clicks on the close the board option from the menu that opens and confirms close the board by clicking close button")
	public void user_clicks_on_the_close_the_board_option_from_the_menu_that_opens_and_confirms_close_the_board_by_clicking_close_button() {
	    
		click(boardPage.closeBoardOption);
		wait(2);
		
		click(boardPage.confirmButtonForCloseTheBoard);
		wait(2);
	}
	
	@Given("User clicks close the board menu \\(x icon)")
	public void user_clicks_close_the_board_menu_x_icon() {
		
	    click(boardPage.closeTheBoardMenu);
	    wait(2);

	}
	
	@Then("User verifies that board is closed")
	public void user_verifies_that_board_is_closed() {
		
	    Assert.assertTrue("Reopen button is not displayed", boardPage.reopenBoardButton.isDisplayed());
	    wait(2);
	}

}
