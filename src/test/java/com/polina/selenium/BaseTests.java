/*******************************************************************************
 * Base class of the Selenium functional tests
 *
 ******************************************************************************/

package com.polina.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.TestCase;

public class BaseTests extends TestCase{
	
	WebDriver driver ;
	
	protected void setUp(){
		driver = new FirefoxDriver();
		driver.get("https://www.qumram.com");
		driver.manage().window().maximize();
		
	}
	
	/**
	 * 
	 * Waits for an element to be loaded
	 * @param seleniumElement - Selenium Element
	 * @return Web Element
	 */
	protected WebElement waitForElement(By seleniumElement){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(seleniumElement));
		return driver.findElement(seleniumElement);
	}
	
	/**
	 * Clicks a link
	 * @param linkText - The text of the link
	 */
	protected void clickLink(String linkText){
		waitForElement(By.linkText(linkText)).click();
	}
	
	protected void tearDown( ){
		driver.close();
	}
}
