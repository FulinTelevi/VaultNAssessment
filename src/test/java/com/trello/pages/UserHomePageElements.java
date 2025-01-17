package com.trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.testbase.PageInitializer;
import com.trello.utils.CommonMethods;

public class UserHomePageElements extends CommonMethods{
	
	@FindBy(xpath = "//div[@data-testid='header-member-menu-avatar']")
	public WebElement accountName;
	
	@FindBy(xpath = "//nav[@id='header']/div[1]/div/div[3]/button")
	public WebElement fCreateButton;
	
	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	public WebElement createBoardButton;
	
	@FindBy(xpath = "//div[@class='atlaskit-portal']/section/div/form/div/label/input")
	public WebElement boardTitleBox;
	
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	public WebElement sCreateButton;
	
	@FindBy(xpath = "//div[@class='board-tile-details is-badged']/div[1]")
	public WebElement openTheBoardButton;
	
	public UserHomePageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
