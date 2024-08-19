package com.trello.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.trello.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class MoveCardsSteps extends CommonMethods{

	@Given("User moves -Sign up for Trello- card to Done List")
	public void user_moves_sign_up_for_trello_card_to_done_list() {
	    
		for(WebElement card : boardPage.listOfCardNames) {
			if(card.getText().equalsIgnoreCase("Sign up for Trello")) {
				click(card);
				break;
			}
		}
		
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", boardPage.moveAction);
        wait(2);
		
        jsExecutor.executeScript("arguments[0].click();", boardPage.selectListForMoving);
        wait(2);
        
        sendText(boardPage.selectListForMoving,"Done");
		boardPage.selectListForMoving.sendKeys(Keys.ENTER);
		wait(1);
		
		click(boardPage.moveButton);
		wait(1);
		
		click(boardPage.closeTheCard);
		wait(2);
		
	}
	
	@Given("User moves -Get key and token- card to Testing List")
	public void user_moves_get_key_and_token_card_to_testing_list() {
		   
			for(WebElement card : boardPage.listOfCardNames) {
				if(card.getText().equalsIgnoreCase("Get key and token")) {
					click(card);
					break;
				}
			}
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", boardPage.moveAction);
	        wait(2);
			
	        jsExecutor.executeScript("arguments[0].click();", boardPage.selectListForMoving);
	        wait(2);
	        
	        sendText(boardPage.selectListForMoving,"Testing");
			boardPage.selectListForMoving.sendKeys(Keys.ENTER);
			wait(2);
			
			click(boardPage.moveButton);
			wait(2);
			
			click(boardPage.closeTheCard);
			wait(2);
			
			
	}
	
	@Given("User moves -Build a collection- card to Doing List")
	public void user_moves_build_a_collection_card_to_doing_list() {
	   
		for(WebElement card : boardPage.listOfCardNames) {
			if(card.getText().equalsIgnoreCase("Build a collection")) {
				click(card);
				break;
			}
		}
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", boardPage.moveAction);
        wait(2);
		
        jsExecutor.executeScript("arguments[0].click();", boardPage.selectListForMoving);
        wait(2);
        
        sendText(boardPage.selectListForMoving,"Doing");
		boardPage.selectListForMoving.sendKeys(Keys.ENTER);
		wait(2);
		
		click(boardPage.moveButton);
		wait(2);
		
		click(boardPage.closeTheCard);
		wait(2);
	}
	
	@Given("User moves -Working on Task- card to Doing List")
	public void user_moves_working_on_task_card_to_doing_list() {
	   
		for(WebElement card : boardPage.listOfCardNames) {
			if(card.getText().equalsIgnoreCase("Working on Task")) {
				click(card);
				break;
			}
		}
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", boardPage.moveAction);
        wait(2);
		
        jsExecutor.executeScript("arguments[0].click();", boardPage.selectListForMoving);
        wait(2);
        
        sendText(boardPage.selectListForMoving,"Doing");
		boardPage.selectListForMoving.sendKeys(Keys.ENTER);
		wait(2);
		
		click(boardPage.moveButton);
		wait(2);
		
		click(boardPage.closeTheCard);
		wait(2);
	}

}
