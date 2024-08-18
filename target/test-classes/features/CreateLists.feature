
Feature: Create Lists in VaultN Board

  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
  

  @smoke3
  Scenario: Successful Create Lists in VaultN Board
    Given User clicks VaultN board
    And User clicks add another list button
    And User enters list name as Backlog in the board and click add list button
    And User enters list name as ToDo in the board and click add list button
    And User enters list name as Doing in the board and click add list button
    And User enters list name as Testing in the board and click add list button
    And User enters list name as Done in the board and click add list button

  
