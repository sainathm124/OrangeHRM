package com.OrangeHRMApplicationWebPages;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMLoginPage extends BaseTest{

	@Test(priority=1,description="Validating Login Page with Title")
	public void ValidationOfLoginPageTitle_LoginPanelText() 
	{	//Login Page TitleValidation
		Log.info("Loginpage Validation: ");
		String Expected_loginpagetitle="OrangeHRM";
		String Actual_loginpagetitle=driver.getTitle();
		
		//Login Page PanelText validation
		String Expected_Loginpagetext="LOGINpanel";
		
		
		
		if(Actual_loginpagetitle.equals(Expected_loginpagetitle))
		{
			Log.info("Passed");
		}
		else
		{
		Log.info("Failed");	
		}
	}
	
	
}
