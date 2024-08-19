
Feature: Close The Board

  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
    And User clicks VaultN board
    
  @smoke6
  Scenario: Close The VaultN Board
    Given User clicks on the ... icon at the top right of the board page
    And User clicks on the close the board option from the menu that opens and confirms close the board by clicking close button
    And User clicks close the board menu (x icon)
    Then User verifies that board is closed
    

 