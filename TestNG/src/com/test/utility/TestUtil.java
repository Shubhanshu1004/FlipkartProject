package com.test.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	static String TESTSHEET_DATA_PATH = "C:\\Users\\Ishani\\Desktop\\TestNG\\src\\com\\testData\\TestNGData.xlsx";	

	public static String[][] getExcelData(String sheetName) {

		FileInputStream file = null;
		XSSFWorkbook book = null;
		XSSFSheet sheet=null;
		Sheet sheet1;
		Workbook book1;

		try {
			file = new FileInputStream(TESTSHEET_DATA_PATH);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			//			book = new XSSFWorkbook(file);
			sheet = book.createSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();		}

		//XSSFSheet sheet = book.getSheetAt(0);


		String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());

		for(int i=0; i<sheet.getLastRowNum(); i++) {
			for(int j=1; j<sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue().toString(); 
				System.out.println(data[i][j]);
			}
		}
		return data;

	}

	public static Object[][] getData(String sheetName) {

		String filePath = "C:\\Users\\Ishani\\Desktop\\TestNG\\src\\com\\testData\\TestNGData.xlsx";
		FileInputStream file = null;
		Sheet sheet;
		Workbook book = null;
		try {
			file = new FileInputStream(TESTSHEET_DATA_PATH);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue().toString();
				System.out.println(data[i][j]);
			}
		}

		return data;


	}

}
