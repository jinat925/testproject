package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(xpath="//a[.='Logout']")
private WebElement lgtlink;
@FindBy(id="container_tasks")
private WebElement tasktab;
public EnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
public void setlogoutlink() {
	lgtlink.click();
} 
public WebElement getTasktab()
{
	return tasktab;
	}
}
