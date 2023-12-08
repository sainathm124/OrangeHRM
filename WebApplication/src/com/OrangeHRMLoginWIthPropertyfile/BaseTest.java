package com.OrangeHRMLoginWIthPropertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	 //Global Variables
	ChromeDriver driver;
	String OHRMApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	//User define Method 
	@BeforeTest
	public void SetUp() 
	{
	//Automating browser
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("********Browser Launched Successfully*******");
	//Navigating to Url address	
	
	driver.get(OHRMApplicationUrlAddress);
	
	//Maximising the Current webpagewindow
	driver.manage().window().maximize();
	//waiting to perform Operation for each element
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	System.out.println("Navigated to Orange HRM Application");
	}
	/*@AfterTest
	public void TearDown() 
	{
	driver.quit();
	System.out.println("*******Application CLosed Successfully*******");
	}
*/
}
