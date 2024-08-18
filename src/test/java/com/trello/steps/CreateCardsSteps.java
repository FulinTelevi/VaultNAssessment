package com.trello.steps;

import org.openqa.selenium.WebElement;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class CreateCardsSteps extends CommonMethods {

	@Given("User clicks Add a Card button in ToDo list and enters card name as Sign up for Trello and clicks add card button")
	public void user_clicks_add_a_card_button_in_to_do_list_and_enters_card_name_as_sign_up_for_trello_and_clicks_add_card_button() {

		click(boardPage.addCardInToDoList);
		wait(2);
		sendText(boardPage.enterCardNameBox, "Sign up for Trello");
		click(boardPage.addCardButton);
		wait(2);
	}

	@Given("User clicks Add a Card button in ToDo list and enters card name as Get key and token and clicks add card button")
	public void user_clicks_add_a_card_button_in_to_do_list_and_enters_card_name_as_get_key_and_token_and_clicks_add_card_button() {

		sendText(boardPage.enterCardNameBox, "Get key and token");
		click(boardPage.addCardButton);
		wait(2);
	}

	@Given("User clicks Add a Card button in ToDo list and enters card name as Build a collection and clicks add card button")
	public void user_clicks_add_a_card_button_in_to_do_list_and_enters_card_name_as_build_a_collection_and_clicks_add_card_button() {

		
		sendText(boardPage.enterCardNameBox, "Build a collection");
		click(boardPage.addCardButton);
		wait(2);
	}

	@Given("User clicks Add a Card button in ToDo list and enters card name as Working on Task and clicks add card button")
	public void user_clicks_add_a_card_button_in_to_do_list_and_enters_card_name_as_working_on_task_and_clicks_add_card_button() {

		sendText(boardPage.enterCardNameBox, "Working on Task");
		click(boardPage.addCardButton);
		wait(2);
		
		click(boardPage.cancelAddingCardInToDoList);
		wait(1);
	}

	@Given("User clicks Add a Card button in Backlog List and enters card name as UI Automation and clicks add card button")
	public void user_clicks_add_a_card_button_in_backlog_list_and_enters_card_name_as_ui_automation_and_clicks_add_card_button() {

		click(boardPage.addCardInBacklogList);
		wait(2);
		sendText(boardPage.enterCardNameBox, "UI Automation");
		click(boardPage.addCardButton);
		wait(2);
	}

	@Given("User clicks Add a Card button in Backlog List and enters card name as Writing Test Scenarios and clicks add card button")
	public void user_clicks_add_a_card_button_in_backlog_list_and_enters_card_name_as_writing_test_scenarios_and_clicks_add_card_button() {

		wait(2);
		sendText(boardPage.enterCardNameBox, "Writing Test Scenarios");
		click(boardPage.addCardButton);
		wait(2);
		
		click(boardPage.cancelAddingCardInBacklogList);
	}

}
