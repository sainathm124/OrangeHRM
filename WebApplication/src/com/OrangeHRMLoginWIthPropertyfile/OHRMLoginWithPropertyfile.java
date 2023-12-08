package com.OrangeHRMLoginWIthPropertyfile;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
	
public class OHRMLoginWithPropertyfile extends BaseTest {
		
	@Test
	public void OHRMApplicationLogin() throws IOException
	{
	//Getting Name if the OHRM Login Page
	String Actual_OrangeHRMLoginPageTitle=driver.getTitle();
	
	System.out.println("The Actual_OHRM Login Page title: "+Actual_OrangeHRMLoginPageTitle);
		
		
	//UserName==== Identifying the property of an element
	//UserName properties are id=txtUsername
	By UserNameProperty=(By.id("txtUsername"));
	//Finding an element with property in the current Page
	WebElement UserName=driver.findElement(UserNameProperty);
	//Sening HardCoded Values to UserName Element
	UserName.sendKeys("sainath");

	//Password=== Ientifying Password Element Properties
	//name="txtPassword" Properties 
	By PasswordProperty=By.name("txtPassword");
	//FInding the element on the driver
	WebElement Password=driver.findElement(PasswordProperty);
	//Sending HardCoded Values to Password Element
	Password.sendKeys("Sandyjones@2807");
	
	//Login Button Operation
	//Properties of Button class="button"
	By buttonProperty=By.className("button");
	WebElement Button=driver.findElement(buttonProperty);
	//Performing an Operation on Button
	Button.click();
	System.out.println("Successfully Loged in OHRM Application");
		
	
	
	}

	
}
	
