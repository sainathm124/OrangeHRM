package com.WebTable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class CapturingCompleteWebTableData extends com.WebTable.BaseTest {

	@Test
	public void CapturingTimeAndDateWebTable() throws IOException 
	{
	/*/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	/html/body/div[5]/section[1]/div/section/div[1]
	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]/a
	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[]/a
	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
	*/
	//Property of Webtable as mentioned above|Identifying the properties of WebElement on the current Webpage
	By AccreElementProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
	//finding the element on the current webpage
	WebElement AccrecitytimeandDate=driver.findElement(AccreElementProperty);
	String FirstElementintheTable=AccrecitytimeandDate.getText();
	System.out.println("The Date and TIme of Citi is: " + FirstElementintheTable);
	
	//Finding the nubmer of Rows in the webtable
	By rowofWebtableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
	//to find the webelements more than one then we can use ArrayList
	//array List syntax: List<webelements>Object=driver,findelement(Property)
	List<WebElement> RowofWebtable=driver.findElements(rowofWebtableProperty);
	int RowofWebtable_Count=RowofWebtable.size();
	System.out.println("The size of Row of webtable: " +RowofWebtable_Count);
	
	//finding the number of coulums on the webtable
	By columnofWebtableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td");
	List<WebElement> columnofWebtable=driver.findElements(columnofWebtableProperty);
	int columnofWebtable_count=columnofWebtable.size();
	System.out.println("The Number of colums in the Webtable: "+columnofWebtable_count);
		
	//webtable data into Excel Sheet
	FileInputStream webtabledata=new FileInputStream("./src/com/WebTable/TimeandDateDetails.xlsx");
	//identifying the workbook in the above file
	XSSFWorkbook workbook=new XSSFWorkbook(webtabledata);
	XSSFSheet timeanddatasheet=workbook.getSheet("workbook");
			
	//Printing all the webtable data into console	
	
	 for(int rowOfindex=1; rowOfindex<=RowofWebtable_Count;rowOfindex++)
	 {	
		 //Create every row nad to go every row of cells in webtable
		 XSSFRow Rowofwebtable =timeanddatasheet.createRow(rowOfindex);
		 for(int cellofIndex=1;cellofIndex<=columnofWebtable_count;cellofIndex++)
		 {
		By dataofWebtableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowOfindex+"]/td["+cellofIndex+"]");
		WebElement webtable=driver.findElement(dataofWebtableProperty);
		//creating new Cell
		XSSFCell RowOfCell=Rowofwebtable.createCell(cellofIndex-1);
			
		String ListOfwebtable=webtable.getText();
			System.out.print(ListOfwebtable+"|");
		RowOfCell.setCellValue(ListOfwebtable);
		System.out.println();
		 FileOutputStream webtableresult=new FileOutputStream("./src/com/WebTable/TimeandDateDetails.xlsx");
		 workbook.write(webtableresult);
		 }
		 
	 }
	
	
	}
	
	
}
