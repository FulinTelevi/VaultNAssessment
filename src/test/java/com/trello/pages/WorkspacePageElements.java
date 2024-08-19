package com.trello.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.utils.CommonMethods;

public class WorkspacePageElements extends CommonMethods {

	@FindBy(xpath = "//div[@aria-label='Board name']//h1")
	public WebElement boardTitleName;

	@FindBy(xpath = "//button[contains(text(),'View all closed boards')]")
	public WebElement viewClosedBoardsButton;

	@FindBy(xpath = "//div[@id='layer-manager-overlay']/div/div/div/div/div//ul//li//div/div/a")
	public List<WebElement> closedBoardsList;

	@FindBy(xpath = "//div[@id='layer-manager-overlay']/div/div/div/div/div/div/ul/li/div//button")
	public List<WebElement> buttonsForClosedBoards;

	@FindBy(xpath = "//button[@data-testid='close-board-delete-board-confirm-button']")
	public WebElement confirmButtonForDeleteTheBoard;

	public WorkspacePageElements() {
		PageFactory.initElements(driver, this);
	}
}
