
Feature: Delete The Board Right After Close The Board

  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
    And User clicks VaultN board
    And User clicks on the ... icon at the top right of the board page
    And User clicks on the close the board option from the menu that opens and confirms close the board by clicking close button

  @smoke8
  Scenario: Delete The VaultN Board Right After Close
    Given User clicks permanently delete button 
    And User confirms deleting action by clicking delete button
   
