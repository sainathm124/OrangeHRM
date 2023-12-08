package com.IdentifyingTheTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePageTitle_getTitle {
	
	public static void main(String[] args) {
		
		//identyfying the browser
		
	System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	
	//creating a class with object, to navigate bing 
	ChromeDriver chromebrowser=new ChromeDriver();
	
	//assigning URL to a variable
	String Actual_HomePageUrlAddress="http:bing.com";
	
	//calling the url of the application//navigating the application
	//with the help of object
	chromebrowser.get("Actual_HomePageUrlAddress_");
	System.out.println("Actual bing homepage address is : "+Actual_HomePageUrlAddress);
	
	//getting the title of current web page
	 String Bing_HomePageTitle_getTitle=chromebrowser.getTitle();
	 System.out.println("Actual name of Bing Home Page is :"+Bing_HomePageTitle_getTitle);
	 
	 //close the application 
	 chromebrowser.close();
	 
	 
	
	
	
}
	
}
