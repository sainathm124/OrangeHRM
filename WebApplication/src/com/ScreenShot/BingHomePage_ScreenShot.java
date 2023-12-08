	 	package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePage_ScreenShot {
	WebDriver driver;
	String applicationUrlAddress="https://www.bing.com";
	
	public void applicationLaunch()		//Method1
		{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		}
	public void capturingScreenShot() throws IOException     //Method2
	{
		//1. pressing the printscreen button of the Keyboard
		//2. Of the current web Page -The ScreenSHot should be taken
			//TakesScreenShot- is intefaceof the Selenium
			//Whenever an interface(Screenshot) is combined with an Object(Driver)of the class
			//Then it is called as TypeCasting 
		//3.Openig a file(e.g:Paint)and Pasting the captured Screenshot in to the file
		//Output Type - is interface of Selenium 
		File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//4.The Captured ScreenShot now should be save to  location of the system
		//5. when Saving the ScreenShot -Should be provided with the Path of the location of the system with the
		//name of the file along with Format of the Image.
		
		FileUtils.copyFile(bingScreenShot,new File("./ScreenShots/bing.png"));
		
		
	}
	public static void main(String[] args) throws IOException 
		{
		BingHomePage_ScreenShot screenshot=new BingHomePage_ScreenShot();
		screenshot.applicationLaunch();
		screenshot.capturingScreenShot();
		screenshot.applicationClose();
		}


		public void applicationClose()
		{
			driver.quit();
		}
}
