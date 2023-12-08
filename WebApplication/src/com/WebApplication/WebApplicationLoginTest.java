package com.WebApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebApplicationLoginTest extends BaseTest {
	FileInputStream DataFile;
	FileOutputStream TestResultFile;
	XSSFWorkbook workbook;
	XSSFSheet DataFileSheet;
	XSSFRow Row;
	XSSFCell Cell;
	
	@Test(priority=1,description= "Validating LoginPanel Text")
	public void validatingloginpagetext() throws IOException 
	{
			//validating Login page Text
			//Identyfying file in the package
		DataFile=new FileInputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
				//Creating new workbook on the Excel File
			workbook=new XSSFWorkbook(DataFile);
				//Identifying Sheet of the above workbook
			DataFileSheet=workbook.getSheet("Sheet1");
				//Identify Row in which the data present in
			 XSSFRow Row=DataFileSheet.getRow(1);
				//identify the Row of Cell
		Cell CellofloginPanelText=Row.getCell(0);
		String expected_loginPanelText=CellofloginPanelText.getStringCellValue();
		//expected_loginPanelText.getStringCellValue(0);
		System.out.println("The Expected Loginpage Text is :"+expected_loginPanelText);
	
			//identyfying Actual Loginpage Text by identifying Loginpanel 
			//<div id="logInPanelHeading">LOGIN Panel</div>	
		By loginpanelTextProperty=By.id("logInPanelHeading");
		WebElement loginpanelText=driver.findElement(loginpanelTextProperty);
		String actual_loginpanelText=loginpanelText.getText();
		System.out.println("The Actual Login panel Text is :"+actual_loginpanelText);
		Row.createCell(1).setCellValue(actual_loginpanelText);
		
			//Validating the Panel text actual and Expected
	 
		if(actual_loginpanelText.equals(expected_loginPanelText))
		{
			System.out.println("Actual and Expected Login panel Text is Matched: PASS");
			XSSFCell resultofloginpanelcell =Row.createCell(2);
			resultofloginpanelcell.setCellValue("Actual and Expected Login panel Text is Matched: PASS");	
		}
		else
			{
			System.out.println("Actual and Expected Login panel Text is Not Matched: Fail");
			XSSFCell resultofloginpanelcell =Row.createCell(2);
			resultofloginpanelcell.setCellValue("Actual and Expected Login panel Text is Not Matched: Fail");
			}	
		//Validating pageTitle
		TestResultFile=new FileOutputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
		workbook.write(TestResultFile);
	}
	
	@Test(priority=2,description= "Validating Loginpage Title")
	public void validatingloginpagetitle() throws IOException 
	{	
		// Login Page title
		String actual_loginpagetitle=driver.getTitle();
		System.out.println("Actual Login Page Title is: "+actual_loginpagetitle);
		//Writing Actual login page title in excel sheet
		
		/*FileInputStream DataFile=new FileInputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
		XSSFSheet DataFileSheet=workbook.getSheet("Sheet1");
		XSSFCell loginpagetitlecell=DataFileSheet.getRow(1).createCell(4);
		loginpagetitlecell.setCellValue(actual_loginpagetitle);*/
		XSSFCell titleCell= DataFileSheet.getRow(1).createCell(4);
		titleCell.setCellValue(actual_loginpagetitle);
				
		//expected webpage title is in excelsheet, getting the page title from excel sheet to validate
		
		//Getting the expecting page title from 
		Cell=DataFileSheet.getRow(1).getCell(3);
		String expected_loginpagetitle=Cell.getStringCellValue();
		System.out.println("expected_loginpagetitle is :"+expected_loginpagetitle);
		
		//Validating actual with expected page title
		if(actual_loginpagetitle.equals(expected_loginpagetitle))
			{
			System.out.println("The page title is matched : PASS");
			Cell cellpagetittle=DataFileSheet.getRow(1).createCell(5);
			cellpagetittle.setCellValue("The page title is matched : PASS");
			}
		else
			{
			System.out.println("The page title is Not Matched  :FAIL");
			Cell cellpagetittle=DataFileSheet.getRow(1).createCell(5);
			cellpagetittle.setCellValue("The page title is Not Matched :FAIL");
			}
		FileOutputStream TestResultFile=new FileOutputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
		workbook.write(TestResultFile);
	}
	
	@Test(priority=3,description= "Validating UserName Password ")
	public void LoginwithvalidData() throws IOException 
		{
		//identifying the user name property: Locator id="txtUsername" Selector 
		By UsernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(UsernameProperty);
		username.sendKeys("Sainath");
		System.out.println("User name Provided in UserName field");
		
		//Identifying the properties of Password: name="txtPassword"
		WebElement password=driver.findElementById("txtPassword");
		password.sendKeys("Sandyjones@2807");
		
		//identifying the properties of Button : class="button"
		//By buttonproperty=By.className("button");
		//WebElement loginbutton=driver.findElement(buttonproperty);
		WebElement buttonproperty1 =driver.findElementByClassName("button");
		buttonproperty1.click();
		System.out.println("Successfully Loged in OrangeHRM application");
		
		//validating Expected Home page with Actual Home Page
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement homepagename=driver.findElementById("welcome");
		String actual_homepagetitle=homepagename.getText();
		System.out.println("Actual_homepagetitle: "+actual_homepagetitle);
		Cell actaulhomepagenamecell=DataFileSheet.getRow(1).createCell(9);
		actaulhomepagenamecell.setCellValue(actual_homepagetitle);
		
		//Expected Home Page title is in Excel Sheet getting cell value
		Cell cellofhomepagedata=DataFileSheet.getRow(1).getCell(8);
		String expected_homepagetitle=cellofhomepagedata.getStringCellValue();
		System.out.println("Expected: "+expected_homepagetitle);
		
		//Validating Actual home page and expected home page
		if(actual_homepagetitle.contains(expected_homepagetitle))
			{
			System.out.println("Actual and expected home page name is Matched: PASS");
			XSSFCell Homepagetitleresultcell=DataFileSheet.getRow(1).createCell(10);
			Homepagetitleresultcell.setCellValue("Actual and expected home page name is Matched: PASS");
			}
		else
			{
			System.out.println("Actual and expected homepage title is not matched: FAIL");
			XSSFCell Homepagetitleresultcell=DataFileSheet.getRow(1).createCell(10);
			Homepagetitleresultcell.setCellValue("Actual and expected homepage title is not matched: FAIL");
			}
		FileOutputStream TestResultFile=new FileOutputStream("./src/com/WebApplication/OHRM_ADD Employee.xlsx");
		workbook.write(TestResultFile);
		}
}


















