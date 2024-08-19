package com.trello.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trello.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{

	public static void sendText(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	public static JavascriptExecutor getJSObject() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;

	}
	
	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
		return wait;

	}

	public static Boolean waitUntilPageLoading() {
		return getWaitObject().until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static WebElement waitForClickability(WebElement element) {

		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {

		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] takeScreenShot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String destination = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(sourceFile, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] pic = ts.getScreenshotAs(OutputType.BYTES);

		return pic;
	}

	public static String getTimeStamp() {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

		return sdf.format(date);
	}
	
	public void moveCard(String cardTitle, String sourceListName, String targetListName) {
		
		WebElement sourceList = boardPage.findList(sourceListName);
		WebElement targetList = boardPage.findCard(cardTitle);
		WebElement card = boardPage.findCard(cardTitle);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(card).perform();
		
        actions.moveToElement(targetList).release(targetList).perform();
		
	}
	
	public static WebElement findCard(String cardTitle) {
		
	    for (WebElement card : boardPage.listOfCardNames) {
	        if (card.getText().equalsIgnoreCase(cardTitle)) {
	            return card;
	        }      	
	    }
		return null;
	}
	
	public static WebElement findList(String listName) {
		
		for(WebElement list : boardPage.listOfListNames) {
			if(list.getText().equalsIgnoreCase(listName)) {
				return list;
			}
		}
		return null;
	}
}
