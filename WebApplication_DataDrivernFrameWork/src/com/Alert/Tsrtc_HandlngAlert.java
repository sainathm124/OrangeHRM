package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Tsrtc_HandlngAlert extends BaseTest {
	
	  public void checkAvailabilityTest() 	//M(1)
	  {
		//Properties of CHeck availability button id="searchBtn"
		 By checkavailabilityProperty=By.id("searchBtn");
		 WebElement availibilityButton=driver.findElement(checkavailabilityProperty);
		 availibilityButton.click();	 
	  }
	  
	  public void HandlingAlert()           //M(2) 
	  {
		Alert alertwindow=driver.switchTo().alert();
		//Validate alert page
		String Expected_AlertText="Please select start place.";
		System.out.println("Alert window Actula Test is: "+Expected_AlertText);
		String actual_alertText=alertwindow.getText();
		System.out.println("Alert window Actula Test is: "+actual_alertText);
		if(actual_alertText.equals(Expected_AlertText))
		{
			System.out.println("actual Alert Text is equal to Expected Alert Text ");
		}
		else 
			System.out.println("actual Alert Text is NOT equal to Expected Alert Text ");
		//To CLick on alert window we have to use the below Statement
		alertwindow.accept();	//will perform the Operation on the Ok button
		//alertwindow.dismiss(); //will perform operation on the Cancel button
		//alertwindow.sendKeys("Test Data"); // to pass the Test data into the alert window
	  }
	  public static void main(String[] args) 
	  {
		Tsrtc_HandlngAlert Alertwindow=new Tsrtc_HandlngAlert();
		Alertwindow.Setup();
		Alertwindow.checkAvailabilityTest();
		Alertwindow.HandlingAlert();
		//Alertwindow.teardown();
	  }
	  
}
