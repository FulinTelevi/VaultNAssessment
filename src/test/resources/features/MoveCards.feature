
Feature: Moving Cards from one List to Another List
  Background:
		Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
    And User clicks VaultN board

  @smoke5
  Scenario: Succesful Moving Card from one List to Another List
    Given User moves -Sign up for Trello- card to Done List
    And User moves -Get key and token- card to Testing List
    And User moves -Build a collection- card to Doing List
    And User moves -Working on Task- card to Doing List
