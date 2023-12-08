package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePageTitleValidation {
	public static void main(String[] args) {
		
		//identyfying the web browser
		System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	
		//Navigating to the application using Class along with Obj. 
		ChromeDriver chromebrowser=new ChromeDriver();
		
		//Navigate to the application using Object
		chromebrowser.get("http://bing.com");
		
		//Expected home page name as per developer/client requirement
		 String ExpectedHomePagename="bing";
		 System.out.println("Expected Home Page Name is : "+ExpectedHomePagename);
		
		String ActualHomePageName=chromebrowser.getTitle();
		System.out.println("the actual Home Page name is :"+ActualHomePageName);
		
		if(ActualHomePageName.equals(ExpectedHomePagename))
		{
	System.out.println("ActualHomePageName is EQUAL to ExpectedHomePagename ");
		}else
		{
	System.out.println("ActualHomePageName is NOT EQUAL to ExpectedHomePagename");
		}
		
		chromebrowser.quit();
	
	}
}
