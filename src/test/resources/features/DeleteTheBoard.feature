
Feature: Delete The Board

	Background:
    Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
     
  @smoke7
  Scenario: Delete The VaultN Board
    Given User clicks -view closed boards- button 
    And User clicks delete button for VaultN Board
    And User confirms deleting action
    
  