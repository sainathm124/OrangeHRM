package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

		WebDriver driver; 
		String ApplicationUrlAddress="https://www.timeanddate.com/worldclock/";
	@BeforeTest
	public void SetUp()    //Method1
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFIles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("****Successfully Browser Launched****");
		driver.get(ApplicationUrlAddress);
		System.out.println("Successfully Navigated to Date and Time application");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		System.out.println("******Application Closed Successfully******");
	}
}
