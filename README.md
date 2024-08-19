Trello Test Automation

This project automates interactions with Trello, including creating boards, lists, cards, moving cards between lists, and managing boards. The project is built using Selenium WebDriver and TestNG (or JUnit) within a Maven setup. The automation is performed on a Trello board named "VaultN".

Project Structure:
  Language: Java
  Testing Framework: JUnit 
  Automation Tool: Selenium WebDriver
  Build Tool: Maven
  Design Pattern: Page Object Model (POM) with PageFactory
  Behavior-Driven Development: Cucumber 
  
Prerequisites:
  Java Development Kit (JDK) installed
  Maven installed and configured
  A valid Trello account
  ChromeDriver for Selenium
  
Setup Instructions:
  1.Add Dependencies
    In the pom.xml, add the necessary dependencies for Selenium WebDriver, JUnit
  2.Create a Trello Account
    Create a Trello account at https://trello.com and this account's used for automation tasks.

Automation Scenarios:
The following scenarios are automated:
    Login to Trello:
      -Go to Trello.
      -Log in with valid credentials.          
    Create a Board:
      -Create a new board named "VaultN".
    Create Lists on the Board:
      -Add the following lists to the "VaultN" board:
      -Backlog
      -Todo
      -Doing
      -Testing
      -Done
    Create Cards in the Lists:
      -Add the following cards to their respective lists:
        "Sign up for Trello" in the Todo list.
        "Get key and token" in the Todo list.
        "Build a collection" in the Todo list.
        "Working on Task" in the Todo list.
        "UI Automation" in the Backlog list.
        "Writing Test Scenarios" in the Backlog list.
    Move Cards:
      -Move "Sign up for Trello" to Done.
      -Move "Get key and token" to Testing.
      -Move "Build a collection" and "Working on Task" to Doing.
    Close and Delete the Board:
      -Automate closing the "VaultN" board.
      -Automate deleting the "VaultN" board.

  Running the test with Junit in TestRunner class by using feature file tags
  
  Common Utility Methods
    This project includes common utility methods to handle interactions such as clicking elements, sending keys, and JavaScript interactions for smooth testing with Selenium.
  
  
