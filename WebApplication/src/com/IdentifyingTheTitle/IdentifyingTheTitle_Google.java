package com.IdentifyingTheTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingTheTitle_Google {

	public static void main(String[] args) {
		
				
		//assigning url to variable--from client
		String GoogleHomePageUrlAddress="http://google.com";		
	
		//idetifying the chromebrowser
		System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	
	//using a class we create a Object to navigate it to browser 
	ChromeDriver chromebrowser= new ChromeDriver();
	
	//calling the browser using object along with navigation method 
	chromebrowser.navigate().to(GoogleHomePageUrlAddress);
	
	//google home page title is google--corresponding to text
		String Expectedgooglehomepagetitle="google";
		System.out.println("Expected google title is : "+Expectedgooglehomepagetitle);
					
		//Assigning the "method" to get the webpage title to a variable
		String ActualGoogleHomePageTitle=chromebrowser.getTitle();
		
		//printing google home page title
		System.out.println("Actual title of google home page is : "+ActualGoogleHomePageTitle);
		
		if(Expectedgooglehomepagetitle.equalsIgnoreCase(ActualGoogleHomePageTitle))
		{
			System.out.println("Actual title of google home page is Matched: Pass");
		}
		else 
		{
		System.out.println("Actual title of google home page is not Matched: Fail");	
		}
		
		String Currenturladdress=chromebrowser.getCurrentUrl();
		System.out.println("The Current webpage url is : "+Currenturladdress);
		
	chromebrowser.close();
	
	
	
	}
}
