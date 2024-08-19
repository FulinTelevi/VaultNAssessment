package com.trello.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.utils.CommonMethods;

public class BoardPageElements extends CommonMethods{

	@FindBy(xpath = "//ol[@id='board']/div/button")
	public WebElement addAnotherListButton;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/textarea")
	public WebElement listNameBox;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/div/button[1]")
	public WebElement AddListButton;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/div/button[2]")
	public WebElement cancelAddListButton;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/ol/li/form/textarea")
	public WebElement enterCardNameBox;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/ol/li/form/div/button[1]")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//*[@id='board']/li[2]/div/div[3]/button[1]")
	public WebElement addCardInToDoList;
	
	@FindBy(xpath = "//*[@id='board']/li[2]/div/ol/li/form/div/button[2]/span/span")
	public WebElement cancelAddingCardInToDoList;
	
	@FindBy(xpath = "//*[@id='board']/li[1]/div/div[3]/button[1]")
	public WebElement addCardInBacklogList;
	
	@FindBy(xpath = "//*[@id='board']/li[1]/div/ol/li/form/div/button[2]/span/span")
	public WebElement cancelAddingCardInBacklogList;
	
	@FindBy(xpath = "//ol[@data-testid='list-cards']/li/div//a")
	public List<WebElement> listOfCardNames;
	
	@FindBy(xpath = "//a[@data-testid='card-back-move-card-button']")
	public WebElement moveAction;
	
	@FindBy(xpath = "//div[@data-testid='move-card-popover-select-list-destination']//input[@aria-autocomplete='list']")
	public WebElement selectListForMoving;
	
	@FindBy(xpath = "//button[@data-testid='move-card-popover-move-button']")
	public WebElement moveButton;
	
	@FindBy(xpath = "//*[@id='layer-manager-card-back']/div/div/div/div/button/span/span")
	public WebElement closeTheCard;
	
	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div[1]/div/span[2]/button[2]/span/span")
	public WebElement menuIconButton;
	
	@FindBy(xpath = "//*[@id='content']/div/div/div[2]/div/div/div/div[2]/div/ul/li[17]/a")
	public WebElement closeBoardOption;
	
	@FindBy(xpath = "//input[@data-testid='close-board-confirm-button']")
	public WebElement confirmButtonForCloseTheBoard;
	
	@FindBy(xpath = "//div[@class='board-menu-header-content']//a[2]")
	public WebElement closeTheBoardMenu;
	
	@FindBy(xpath = "//button[@data-testid='workspace-chooser-trigger-button']")
	public WebElement reopenBoardButton;
	
	@FindBy(xpath = "//div[@class='board-menu-container']//div[2]/div[1]/ul/div[3]//button")
	public WebElement deleteBoardButtonAfterCloseBoard;
	
	@FindBy(xpath = "//button[@data-testid='close-board-delete-board-button']")
	public WebElement permanenetlyDeleteBoardButton;
	
	@FindBy(xpath = "//button[@data-testid= 'close-board-delete-board-confirm-button']")
	public WebElement confirmButtonForDeleteTheBoard;
	
	public BoardPageElements() {
		PageFactory.initElements(driver, this);
	}
}
