package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws FileNotFoundException {
		
		//identify the file (Excel file)
		FileInputStream testDataFIle=new FileInputStream("./src/com/Excel/TestData.xlsx");
		
		//Identify the workbook in the file
				XSSFWorkbook workBook=new XSSFWorkbook();
						
				//identifying the Sheet of the workbook
				XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
				
				//identyfy a particular Row in the sheet
				//Row - interface of APACHE-POI - COnsuder it is one of the data type
				XSSFRow testDataSheetRow=testDataSheet.getRow(0);
				
				//Idetify a Particular Row of Cell in the Sheet
				XSSFCell testDataSheetRowOfCell=testDataSheetRow.getCell(0);
				
				//Get the Test Data from the Row OF Cell
				String testData=testDataSheetRowOfCell.getStringCellValue();
				
				System.out.println(testData);
					
		
		
		
	}
}
