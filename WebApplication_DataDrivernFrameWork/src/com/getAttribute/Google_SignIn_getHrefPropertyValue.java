package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_getHrefPropertyValue {

public static void main(String[] args) {

String applicationUrlAddress="http://google.com";

// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

// Navigating to Google Home Page
driver.get(applicationUrlAddress);

// Identifying the properties of Sign In Element
// <a  href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
//continue=https://www.google.com/&amp;ec=GAZAmgQ"
// target="_top"><span >Sign in</span></a>

/*
  a -  an anchor Tag
href - an attribute

  Then the element is of Type - link

  To Automate the link using WebDriver
-----------------------------------------------

 locator - linkText
 Selector - Sign in
*/

// Identifying the Property of the element
By signInPropety=By.linkText("Sign in");

// Identifying the element with the property on the Current Webpage
WebElement signIn=driver.findElement(signInPropety);

String actual_PropertyValueOfHrefAttribute=signIn.getAttribute("href");
System.out.println(" The attribute value of Href of Sign In element in Google HomePage is :- "+actual_PropertyValueOfHrefAttribute);

String attributeValueOfTarget=signIn.getAttribute("target");
System.out.println("The attribute value of target of SignIn element in Google Home Page is :- "+attributeValueOfTarget);

driver.quit();


}

}
