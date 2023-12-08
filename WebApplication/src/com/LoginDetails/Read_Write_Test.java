package com.LoginDetails;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_Write_Test {
	public static void main(String[] args) throws IOException {
		
		FileInputStream detailsfile=new FileInputStream("./src/com/Exceldetails/Details.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(detailsfile);
		
		XSSFSheet detailsfileSheetworkbookSheet= workBook.getSheet("Sheet1");
	Row	detailsfileSheetworkbookSheetRow=detailsfileSheetworkbookSheet.getRow(0);
	
	 Cell detailsfileSheetworkbookSheetRowOfCell=detailsfileSheetworkbookSheetRow.getCell(0);
	 
	 
	String detailsfileSheetworkbookSheetRowOfCellData=detailsfileSheetworkbookSheetRowOfCell.getStringCellValue();

	System.out.println(detailsfileSheetworkbookSheetRowOfCellData);
		
		
	}
}
