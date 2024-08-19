package com.trello.testbase;

import com.trello.pages.BoardPageElements;
import com.trello.pages.HomePageElements;
import com.trello.pages.UserHomePageElements;
import com.trello.pages.WorkspacePageElements;

public class PageInitializer extends BaseClass{

	public static HomePageElements homePage;
	public static UserHomePageElements userHomePage;
	public static WorkspacePageElements workspacePage;
	public static BoardPageElements boardPage;
	
	
	public static void initialize() {
		
		homePage=new HomePageElements();
		userHomePage= new UserHomePageElements();
		workspacePage = new WorkspacePageElements();
		boardPage = new BoardPageElements();
	}
}
