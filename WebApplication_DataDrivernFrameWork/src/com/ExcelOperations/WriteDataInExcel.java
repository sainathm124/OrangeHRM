package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		//Navigating to the file 
		FileInputStream writetestdata=new FileInputStream("./src/com/Excel/WriteTestData.xlsx");
		System.out.println("*****File Path Declared*********");
		//Navigating to Workbook
		XSSFWorkbook workbook=new XSSFWorkbook(writetestdata);
		System.out.println(workbook);
		//Navigating to Sheet
		XSSFSheet testdata=workbook.getSheet("TestData");
		//Creating a particular Row in the Sheet
		XSSFRow testdatarow=testdata.createRow(0);
		//Creating a particular Cell of Row
		XSSFCell testdatarowofcell=testdatarow.createCell(0);
		//setting a value into a data into the rowcell we created 
		testdatarowofcell.setCellValue("sainath");
		FileOutputStream testresultfile=new FileOutputStream("./src/com/Excel/WriteTestData.xlsx");
		workbook.write(testresultfile);
		
				
	}
}
