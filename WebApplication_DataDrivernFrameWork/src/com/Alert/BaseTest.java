package com.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	//In the Base test we have to create 2 USDMETHODS..1. creating Setup 2. Creating Application CLose
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","./browserDriverFIles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ApplicationUrlAddress);
		System.out.println("******Application Successfully Navigate***********" );
	}
	public void teardown() {
		driver.quit();
		System.out.println("*******Application Succesfully Closed*********");
	
	}
	
}
