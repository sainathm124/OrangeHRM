package com.DropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingDropDown extends BaseTest {
	
	public void SelectLanguage_DropDown() 
	//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	{ 
		///html/body/div[2]/header/div/div/div/ul/li[9]/select/option[1]
		// /html/body/div[1]/header/div/div/div/ul/li[9]/select/option
		///html/body/div[2]/header/div/div/div/ul/li[9]/select
		//	/html/body/div[1]/header/div/div/div/ul/li[9]/select
	By selectlanguageproperty=By.xpath("/html/body/div[2]/header/div/div/div/ul/li[9]/select/option");
	List<WebElement>Selectlanguage=driver.findElements(selectlanguageproperty);
	int NumberofLanguages=Selectlanguage.size();
	
	System.out.println("Total Number of Languages in the Dropdown: " +NumberofLanguages);
	}
	
	public static void main(String[] args) {
		HandlingDropDown DropDown=new HandlingDropDown();
		DropDown.Setup();
		DropDown.SelectLanguage_DropDown();
		DropDown.teardown();
		
	}
}
