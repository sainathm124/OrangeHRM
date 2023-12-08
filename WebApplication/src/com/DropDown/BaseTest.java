package com.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String ApplicationUrlAddress="https://www.osmania.ac.in/";
	//In the Base test we have to create 2 USDMETHODS..1. creating Setup 2. Creating Application CLose
	///html/body/div[2]/header/div/div/div/ul/li[9]/select/option[1]
	///html/body/div[2]/header/div/div/div/ul/li[9]/select
	///html/body/div[2]/header/div/div/div/ul/li[9]
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","./browserDriverFIles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ApplicationUrlAddress);
		System.out.println("******Application Successfully Navigate***********" );
	}
	public void teardown() {
		driver.quit();
		System.out.println("*******Application Succesfully Closed*********");
	
	}
	public static void main(String[] args) {
		BaseTest application= new BaseTest();
		application.Setup();
		//application.teardown();
	}
}
