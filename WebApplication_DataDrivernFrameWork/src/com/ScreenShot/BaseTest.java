package com.ScreenShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	ChromeDriver driver;
	String tsrtc_urlAddress="https://www.tsrtconline.in/oprs-web/";
	
	public void Setup()
	{
		//we have to Automating the broweser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println(" ***** Successfully launched Chrome Browser ******* ");
		driver.get(tsrtc_urlAddress);
		driver.manage().window().maximize();
		//elements to be identified with the given property
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//its a time out related to the Application webpage to be loaded on the Browser
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		System.out.println("*Navigated to Tsrtc Home page Successfully*");
	}
	
	public void teardown() 
	{
		System.out.println("**********Application Closed Successfully**********");
	driver.quit();	
	}
	
		
	}

