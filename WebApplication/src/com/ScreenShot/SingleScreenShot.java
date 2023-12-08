package com.ScreenShot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SingleScreenShot extends BaseTest {
/*
 1.To take the screen shot of by pressing the prtscreen button,the Screen
 2.Current webpage screen Shot should be captured. 
 	Takesthescreenshot--it is an interface of Selenium 
 	Whenever an interface (TakesScreenShot)it is combined with Object(Dirver)of the class
 	then it is called as TypeCasting...
 3. Opening the a File(eg:Paint)and Pasting the captured Screenshot into the file
 	OutputType-is an interface of Selenium
 	Syntax: File ScreenShotname=((Takescreenshot)driver).getscreenshotAs(OutPutType.FILE)
 4. The captured Screenshot is now should be saved to location of the system
 5. when Screenshot saving - should be provided with the path of the location of the the 
 	system along with the name of the file along with Format of the Image.
 	FIleUtils.copyFile(screenshotname, new File("Path of the File.imagetype"));
 */
	
	public void sscreenshot() throws IOException 
	{
		//Screenshot of the current webpage syntax
		//File singescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File singlescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //when saving the Screenshot - should be provided with the path of the
//	     location of the System with the Name of the file along with format of the image
		FileUtils.copyFile(singlescreenshot, new File("./ScreenShot/Single_ScreenShot.png"));
			System.out.println("Took the screen shot successfully");
	}
	public static void main(String[] args) throws IOException {
		SingleScreenShot sshot= new SingleScreenShot();
		sshot.Setup();
		sshot.sscreenshot();
		sshot.teardown();
		
	}
	
	}
