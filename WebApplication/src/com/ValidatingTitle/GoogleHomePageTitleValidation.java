package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTitleValidation {

	public static void main(String[] args) {
		
		//Identifying the Browser
		System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		
		//Creating Class with Object
		ChromeDriver chromebrowser= new ChromeDriver();
	
		//navigating to webapplication Or Navigating to Google Home Page using OBJECT
		chromebrowser.navigate().to("http://Google.com");
		
		//to get the title name of Google Home page 
		chromebrowser.getTitle();
		
		//Closing the browser
		chromebrowser.close();
//to print the title name is console, we should assing the above "chromebrowser.getTitle()" to a variable.  
		
		String ActualHomepageName =chromebrowser.getTitle();
		System.out.println("Atctual Name of google home page is:  "+ActualHomepageName);
		
		String ExpectedHomePageName="google";
		System.out.println("Expected Name of google home page is: "+ ExpectedHomePageName);
	
	
		
		if(ActualHomepageName.equalsIgnoreCase(ExpectedHomePageName))
		{
			System.out.println("Actual Home page Name is Equal to Expected Home Page: Pass");
		}
		else
		{
			System.out.println("Actual Home page Name is does Not Equal to Expected Home Page: Fail ");
		}
		
	
	
	}
}
