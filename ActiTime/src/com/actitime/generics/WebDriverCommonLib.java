package com.actitime.generics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Generic class for WebDriver Methods
 * @author jinat
 *
 */

public class WebDriverCommonLib {
	
	/**
	 * Explicit wait For element is displayed or not
	 * @param driver
	 * @param element
	 */
	
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * Implicit wait for element is present in Gui
	 * @param driver
	 */

	public void waitForElementInGui(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Custom wait for element is present or not
	 * @param element
	 */
	
	public void customWait(WebElement element) {
		int i=0;
		while(i<100) {
			try {
				element.isDisplayed();
				break;
			}
			catch(NoSuchElementException e){
				i++;
			}
		}
	}
	
	/**
	 * Select the option in the list box by using index
	 * @param element
	 * @param i
	 */
	
	public void selectOption(WebElement element, int i) {
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	
	/**
	 * Select the option in the list box by using text
	 * @param element
	 * @param text
	 */
	
	public void selectOption(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
}
