package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

public class CapturingFirstColunnCityNames extends BaseTest {

	public void capturingFirstColunnCityNames() {
		//Xpath of the First row of first cell
		//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[12]/td[1]/a
		//first row of Last Cell
		//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathExpressionPart2="]/td[1]/a";
		
	 
		for(int rowindex=1; rowindex<=36;rowindex++)
		{
			By cityNameProperty=By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2);
			WebElement cityname=driver.findElement(cityNameProperty);
			String citynameText=cityname.getText();
			System.out.println(citynameText);
		}
	}
	public static void main(String[] args) {
		CapturingFirstColunnCityNames getcityname=new CapturingFirstColunnCityNames();
	//	getcityname.applictionLaunch();
		getcityname.capturingFirstColunnCityNames();
	//	getcityname.ApplicationClose();
	}
}
