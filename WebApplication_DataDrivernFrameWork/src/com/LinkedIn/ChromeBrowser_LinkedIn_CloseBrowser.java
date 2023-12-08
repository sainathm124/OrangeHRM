package com.LinkedIn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser_LinkedIn_CloseBrowser {

	public static void main(String[] args) {
		
		//Identifying the browser
		System.setProperty("webdriver.edge.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\msedgedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		//creating a class aling with object to navigate browser
		//Class			Objectg	
		ChromeDriver chromebrowser = new ChromeDriver(); 
		//Using object we can navigate to apllication
	
		//Navigating to an application using Object,with respect to class 
		chromebrowser.navigate().to("http://LinkedIn.com");
		
		//creating a class aling with object to navigate browser
		//Class			Objectg	
		EdgeDriver edgebrowser = new EdgeDriver();
		
		//Navigating to an application using Object,with respect to class 
		edgebrowser.navigate().to("http://outlook.com");
		
		chromebrowser.navigate().to("http://youtube.com");
		
		chromebrowser.close();
		edgebrowser.quit();
		
		
		
		
		
	
		
	}
	
}
