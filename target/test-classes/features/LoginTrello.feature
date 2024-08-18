
Feature: Login to Trello with Valid Credantials
  
  @smoke1
  Scenario: Successful Login to Trello
    Given User navigates to trello website and click login button
    And User enters his email in emailbox and click continue button 
    And User enters his password in passwordbox and click Log in button
    Then User verifies that he is on his account page.
    

 