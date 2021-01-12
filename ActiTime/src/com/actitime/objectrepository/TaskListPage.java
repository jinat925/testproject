package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewbtn;

@FindBy(xpath = "//div[.='+ New Customer']")
private WebElement newcustomerotpion;
@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement entercustomertbx;


@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescription;

@FindBy(xpath = "//div[@class='emptySelection']")
private WebElement dropdownlinkselectcustomer;

@FindBy(xpath="//div[@class='itemRow cpItemRow selected' and .='Big Bang Company']")
private WebElement Bigbangdropdown;

@FindBy(xpath = "//div[.='Create Customer']")
private WebElement createcustomer;
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
public WebElement getAddnewbtn() {
	return addnewbtn;
}
public WebElement getNewcustomerotpion() {
	return newcustomerotpion;
}
public WebElement getEntercustomertbx() {
	return entercustomertbx;
}
public WebElement getCustomerdescription() {
	return customerdescription;
}
public WebElement getDropdownlinkselectcustomer() {
	return dropdownlinkselectcustomer;
}
public WebElement getOurcompanydropdown() {
	return Bigbangdropdown;
}
public WebElement getCreatecustomer() {
	return createcustomer;
}

}
