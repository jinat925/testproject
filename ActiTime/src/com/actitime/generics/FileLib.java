package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is the generic class for data driven testing 
 * @author Me
 *
 */
public class FileLib {
	/**
	 * Reading the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;

	}



	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelValue(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}

	/**
	 * Write the data back to excel
	 * @param Value
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelValue(String Value, String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(Value);

		FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}

