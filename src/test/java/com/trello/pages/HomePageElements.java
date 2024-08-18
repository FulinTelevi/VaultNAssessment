package com.trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.utils.CommonMethods;

public class HomePageElements extends CommonMethods {

	@FindBy(xpath = "//div[@id='BXP-APP']//following-sibling::div[2]//a[1][contains(text(),'Log in')]")
	public WebElement fLoginButton;
	
	@FindBy(id = "username")
	public WebElement userNameBox;
	
	@FindBy(id= "login-submit")
	public WebElement continueButton;
	
	@FindBy(id = "password")
	public WebElement passwordBox;
	
	@FindBy(id= "login-submit")
	public WebElement sLoginButton;

	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
}
