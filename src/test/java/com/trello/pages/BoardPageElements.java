package com.trello.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.utils.CommonMethods;

public class BoardPageElements extends CommonMethods {

	@FindBy(xpath = "//div[@aria-label='Board name']//h1")
	public WebElement boardTitleName;
	
	@FindBy(xpath = "//ol[@id='board']/div/button")
	public WebElement addAnotherListButton;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/textarea")
	public WebElement listNameBox;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/div/button[1]")
	public WebElement AddListButton;
	
	@FindBy(xpath = "//ol[@id='board']/div/form/div/button[2]")
	public WebElement cancelAddListButton;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/div/div/h2")
	public List<WebElement> listOfLists;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/div[3]/button[1]/span")
	public List<WebElement> addAcardButtons;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/ol/li/form/textarea")
	public WebElement enterCardNameBox;
	
	@FindBy(xpath = "//ol[@id='board']/li/div/ol/li/form/div/button[1]")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//button[@aria-label='Show menu']")
	public WebElement menuIconButton;
	
	@FindBy(xpath = "//div[@class='board-menu-container']//div[2]/div[1]/ul/li/a/span")
	public List<WebElement> listsOfMenu;
	
	@FindBy(xpath = "//div[@class='board-menu-container']//div[2]/div[1]/ul/div[3]//button")
	public WebElement deleteBoardButton;
	
	public BoardPageElements() {
		PageFactory.initElements(driver, this);
	}
}
