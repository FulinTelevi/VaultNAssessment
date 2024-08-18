

Feature: Create Board in Trello

  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button


  @smoke2
  Scenario: Successful CreateBoard in Trello
    Given User clicks create button on the user homepage
    And User clicks Create Board button
    And User enters board name into the board title box
    And User clicks create button
    
  
