package com.BrowsersAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestingBrowsers {

	public static void main(String[] args) {
		
		//Identifying the Browser in the system-Chrome Browser
System.setProperty("webdriver.chrome.driver","E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		
		/*1. Chrome Driver is a class of selenium
		  2. Class cannot be interacted directly 
		  3. TO interact with Class we need to Create an Object 
		 */
		ChromeDriver Chromebrowser = new ChromeDriver();
		
		
//System.setproperty is used to identifying the browser
System.setProperty("webdriver.edge.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\msedgedriver.exe");
		
	//Clicking browser we us class with object
	EdgeDriver Edgebrowser = new EdgeDriver();
	
	Chromebrowser.close();
	Edgebrowser.close();
		
		
	}
}
