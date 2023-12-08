package com.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		public class Amazon_YourWishList_Click {
		//Global Varaibles
		//Automation of Web Browser
		WebDriver driver;
		String ApplicationURLAddress="https://www.amazon.in";
	
		public void ApplicationLaunch()	//========Method 1
		{							
		//Navigating the Browser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println( " **** Successfully Launched Chrome Browser ***** ");
		driver.get(ApplicationURLAddress);		
		//driver.manage().window().maximize();
		System.out.println("*******Browser Navigated to Amazon Application Home Page*****");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
		public void helloSigninMouseHover() //========Method 2
		{
		//Hellosignin is Mouse Hover Operation 
		//Property of HelloSignin is id="nav-link-accountList"
		By HelloSigninProperty=By.id("nav-link-accountList");
		WebElement HelloSignin=driver.findElement(HelloSigninProperty);
		//Actions-its a class of a Selenium used to perform Operations related Mouse Or Keyboard
		Actions hellosigninmousehover=new Actions(driver);
		//1.What type of operation SHould be done
		//2.Where the operation should be performed
		hellosigninmousehover.moveToElement(HelloSignin).build().perform();
		}
	
		public void YourWishList_Click() 	//========Method 3
		{
		//CLick on YourWishList
		//Identifying the Properties YourWishList: <span class="nav-text">Your Wish List</span>
		//Selector: class & Locator: "nav-text"	
		By WishyourListProperty=By.className("nav-text");
		WebElement WishyourList=driver.findElement(WishyourListProperty);
		WishyourList.click();			
		}
	
		public void ApplicationClose()     //========Method 4 
		{
			driver.quit();
			System.out.println("*****Application is Closed****");
		}
		
		public static void main(String[] args) {
		
		Amazon_YourWishList_Click amazon=new Amazon_YourWishList_Click();
		
		//Calling the Methods by creating Object 
		amazon.ApplicationLaunch();			//Calling Method1
		amazon.helloSigninMouseHover();		//Calling Method2
		amazon.YourWishList_Click();		//Calling Method3
		amazon.ApplicationClose();   		//Calling Method4
		}
	
	
}


