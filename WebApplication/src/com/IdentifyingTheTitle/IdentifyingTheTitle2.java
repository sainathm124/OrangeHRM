package com.IdentifyingTheTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingTheTitle2 {

	
	public static void main(String[] args) {
		
		//assigning url to variable ----cleint 
		String E_url="http://facebook.com";
		//assigning Title to variable ----cleint 
		String E_tittle="facebook";
		
		//Identyfying the browser 
		System.setProperty("webdriver.chrome.driver", "//E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		
		//creating class along object
		ChromeDriver chromebrowser= new ChromeDriver();
		
		chromebrowser.navigate().to(E_url);
		System.out.println("The ActualUrl "+E_url);

		String A_tittle=chromebrowser.getTitle();	
		System.out.println("Actual name is : " +A_tittle);
		
		if(A_tittle.contains(E_tittle))
		{
			System.out.println("A_title is matched with E_title: Pass");
		}
		else
		{
			System.out.println("A_title is Not matched with E_title: Fail");
		}
		
	}
}
