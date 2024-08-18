package com.trello.testbase;

import com.trello.pages.BoardPageElements;
import com.trello.pages.HomePageElements;
import com.trello.pages.UserHomePageElements;

public class PageInitializer extends BaseClass{

	public static HomePageElements homePage;
	public static UserHomePageElements userHomePage;
	public static BoardPageElements boardPage;
	
	
	public static void initialize() {
		
		homePage=new HomePageElements();
		userHomePage= new UserHomePageElements();
		boardPage = new BoardPageElements();
	}
}
