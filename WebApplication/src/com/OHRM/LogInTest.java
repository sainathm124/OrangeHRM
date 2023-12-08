package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	
	public static void main(String[] args) {
		
ChromeDriver driver;
String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	//Automating ChromeBrowser
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("*********Successfully Automated Browser");

	//Navigating to OrangeHRM Application Login Page
	driver.get(ApplicationUrlAddress);
	System.out.println("************Successfully Navigated to OHRM Login Page**********");
	
	//Validating Orange HRM Application Login Page
	//Identifying the UserName Element on the webpage
	//Identifying the properties of UserName Element-by inspecting
	//<input name="txtUsername" id="txtUsername" type="text">
	
	//Id-Locator
	//txtUsername-Selector
	
	//driver.findElement(By.id("txtUsername")).sendKeys("Sandy");
	//driver.findElementById("txtUsername").sendKeys("sandy");
	
	//UserNameProperty=By.id("txtUsername";its a property of Element-UserName
	
	//String UserNameTestData="sainath";
	
	// Identifying the property of an element
	By UserNameProperty=(By.id("txtUsername"));
	
	//Finding an element with property in the current Page
		WebElement UserName=driver.findElement(UserNameProperty);
	//Operation Should be performaed on UserName
		UserName.sendKeys("Sainath");
		
	// Identifying properties of Password Element
	// <input name="txtPassword" autocomplete="off" type="password">
		
	//Assaining a Test data to a varaible
	//String PasswordTestData="Sandyjones@2807";
	
	//Identyfying the property of Password Element
	By PasswordProperty=By.name("txtPassword");
	
	//Finding an element Password with its property
	WebElement  Password=driver.findElement(PasswordProperty);
	
	//Performing an Operation on the WebElement Password
	Password.sendKeys("Sandyjones@2807");
	
	//Identifying the property if Login Button
	// <input type="submit"  class="button"  value="LOGIN">
	By loginButtonProperty=By.className("button");
	
	//Finding an element LoginButton with its Property
	WebElement LoginButton=driver.findElement(loginButtonProperty);
	
	//Performing an operation on Login Button
	LoginButton.click();
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	}
	

}
