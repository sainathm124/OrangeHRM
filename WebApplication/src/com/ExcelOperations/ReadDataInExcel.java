package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataInExcel {

	public static void main(String[] args) throws IOException {
		//Navigating to the file
		FileInputStream testdata=new FileInputStream("./src/com/Excel/TestData.xlsx");
		System.out.println("*******Navigated to file*********");
		
		//Identify the workbook in the file
		XSSFWorkbook workbook=new XSSFWorkbook(testdata);
		
		//Identify the Sheet in the workbook
		XSSFSheet SheetOftestdata=workbook.getSheet("TestData");
		
		//Identyfy a particular row in the Sheet
		//ROw is the Interface of APACHE POI Cosnider it as a one of the data type
		XSSFRow testdataOfRow=SheetOftestdata.getRow(1);
		
		//Identify Row of cell in the sheet
		Cell testdataRowofcell=testdataOfRow.getCell(0);
		
		// get the Test Data from the Row of the Cell
		String testData=testdataRowofcell.getStringCellValue();
		System.out.print(testData);
		
		//2nd row of 2nd cell data
		Cell testdatarowofCell1=testdataOfRow.getCell(1);
		String testdata1=testdatarowofCell1.getStringCellValue();
		System.out.println("| " +testdata1);
		
		
		
		
		
	}
}
