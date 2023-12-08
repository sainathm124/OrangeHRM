package com.WebApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	//Automating the Browser
	ChromeDriver driver;
	//Navigating the Browser to OHRM Applicatio
	String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	FileInputStream DataFile;
	FileOutputStream TestResultFile;
	XSSFWorkbook workbook;
	XSSFSheet DataFileSheet;
	XSSFRow Row;
	XSSFCell Cell;

	@BeforeTest
	public void Setup() 
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		//Navigating the Browser to Url Address
		driver.get(ApplicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Application Opend Successfully");
		}
	/*@AfterTest
	public void teardown() 
	{
		driver.quit();	
		System.out.println("Application Closed Successfully");
		
	}*/
}
