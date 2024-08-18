
Feature: Create Cards For The Lists

  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
    And User clicks VaultN board

  @smoke4
  Scenario: Succesful Create Card For The Lists
    Given User clicks Add a Card button in ToDo list and enters card name as Sign up for Trello and clicks add card button
    And User clicks Add a Card button in ToDo list and enters card name as Get key and token and clicks add card button
    And User clicks Add a Card button in ToDo list and enters card name as Build a collection and clicks add card button
    And User clicks Add a Card button in ToDo list and enters card name as Working on Task and clicks add card button
    And User clicks Add a Card button in Backlog List and enters card name as UI Automation and clicks add card button
    And User clicks Add a Card button in Backlog List and enters card name as Writing Test Scenarios and clicks add card button
