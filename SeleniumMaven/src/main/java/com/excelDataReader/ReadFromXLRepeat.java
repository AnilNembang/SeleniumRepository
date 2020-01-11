package com.excelDataReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromXLRepeat {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		XSSFWorkbook xwb=new XSSFWorkbook(fis);
		XSSFSheet sheet = xwb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(3);
		//String value = cell.getStringCellValue();
		double value = cell.getNumericCellValue();
		System.out.println(value);
	}

}
