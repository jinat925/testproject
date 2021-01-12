package com.actitime.testscripts;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.objectrepository.EnterTimeTrack;
import com.actitime.objectrepository.TaskListPage;

public class Customermodule extends BaseClass {
	@Test
	public void testcreatecustomer() throws EncryptedDocumentException, IOException 

	{
		FileLib f = new FileLib();
		WebDriverCommonLib wbCommonLib = new WebDriverCommonLib();
		wbCommonLib.waitForElementInGui(driver);
	 String customername = f.getExcelValue("CreateCustomer", 1, 2);
	 String customerdescription = f.getExcelValue("CreateCustomer", 1, 3);
		EnterTimeTrack e = new EnterTimeTrack(driver);
		//click on task tab
		e.getTasktab().click();
		TaskListPage t= new TaskListPage(driver);
		//click on new add button
		t.getAddnewbtn().click();
		//click on Add new Customer option
		t.getNewcustomerotpion().click();
		t.getEntercustomertbx().sendKeys(customername);
		t.getCustomerdescription().sendKeys(customerdescription);
		t.getNewcustomerotpion().click();
		
		t.getDropdownlinkselectcustomer().click();
		
	}

}
