package com.NavigatingToApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingApplication {

	public static void main(String[] args) {
		
		//Identyfying the chrome bowser using chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	
		//Creating driver class to control it we should create object
		//class			//object
		ChromeDriver chromebrowser= new ChromeDriver();
		
		// USing the Object - getting an application on the current Browser
		chromebrowser.get("http://bing.com");
		
		// Closing the current chrome Browser opened by Selenium WebDriver
		chromebrowser.close();
		
				
	
	}
}
