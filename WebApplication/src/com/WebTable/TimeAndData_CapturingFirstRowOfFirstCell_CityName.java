package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimeAndData_CapturingFirstRowOfFirstCell_CityName extends BaseTest {
	
	public void capturingFirstRowOfFirstCellCityName()
	{
	//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	//Locator:Xpathexception
	//Selector: html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	By cityNameProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
	WebElement cityName=driver.findElement(cityNameProperty);
	String CityName=cityName.getText();
	System.out.println("First Row Of First Cell CityName: "+ CityName);
	
	}
	public static void main(String[] args) {
		TimeAndData_CapturingFirstRowOfFirstCell_CityName getCityName =new TimeAndData_CapturingFirstRowOfFirstCell_CityName();
		//getCityName.applictionLaunch();
		getCityName.capturingFirstRowOfFirstCellCityName();
		//getCityName.ApplicationClose();
		
	}
	
}
