package com.WebApplication;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class LoginDataWithvalidinvalid_ScreenShots extends BaseTest {
	public void ScreenShotwithData() throws IOException 
	{    //Properties name="txtUsername" 
		//Getting the value of Username from External ExcelFile
		WebElement username=driver.findElementByName("txtUsername");	
	DataFile=new FileInputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
	workbook=new XSSFWorkbook(DataFile);
	DataFileSheet=workbook.getSheet("Sheet1");
	XSSFCell usernamedataOfcell=DataFileSheet.getRow(1).getCell(6);
	String dataOfUserName= usernamedataOfcell.getStringCellValue();
	System.out.println("User Name Data is: "+dataOfUserName);
	username.sendKeys(dataOfUserName);
	//Properties of Password Field id="txtPassword"
	WebElement Passwrod=driver.findElementById("txtPassword");
	
	//Getting the value of Password from External ExcelFile
	XSSFCell passworddataOfcell=DataFileSheet.getRow(1).getCell(7);
	String dataofPassword=passworddataOfcell.getStringCellValue();
	Passwrod.sendKeys(dataofPassword);
	
	//
	
	
	}

}
