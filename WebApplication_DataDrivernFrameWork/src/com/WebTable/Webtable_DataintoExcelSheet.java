package com.WebTable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Webtable_DataintoExcelSheet extends BaseTest 
	{
	@Test(priority=1,description="finding fisrt citiname in the webtable")
	public void Capturingwebtabledata() {
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[5]/a
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	    By firstcitiproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
		WebElement firstciti=driver.findElement(firstcitiproperty);
		String Nameofciti=firstciti.getText();
		System.out.println("Fisrt name of WebTable: "+Nameofciti);
	}
	@Test(priority=2,description="finding number of rows and Columns in the webtable")
	public void WebTabletoExcel() throws IOException 
		{
	//Xpath Of the Element: /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[5]
		List<WebElement> rowOftable=driver.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr"));
		int rowOftable_Count=rowOftable.size();
		System.out.println("number of rows in the WebTable: "+rowOftable_Count);
	// to find number of columns
		List<WebElement> columnOfRow=driver.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td"));
		int columnOfRow_count =columnOfRow.size();
		System.out.println("Number of Columns in the webtable: "+columnOfRow_count);
	//webtable data importing to Excel SHeet
	//	rowOftable_Count, columnOfRow_count
		FileInputStream webtabledata=new FileInputStream("./src/com/WebTable/TimeandDateDetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(webtabledata);
		XSSFSheet timeanddatesheet=workbook.getSheet("timeanddate");
		for(int rowindex=1; rowindex<=rowOftable_Count;rowindex++)
		{
			XSSFRow excelrow=timeanddatesheet.createRow(rowindex-1);
			for(int cellindex=1;cellindex<=columnOfRow_count;cellindex++)
			{
				List<WebElement> webTableData=driver.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+cellindex+"]"));
				XSSFCell excelcell=excelrow.createCell(cellindex-1);
				
				
				
			}
			
		}
		
	}
}
