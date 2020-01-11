package com.excelDataReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReadingByColNum {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String val = cell.getStringCellValue();
		System.out.println(val);
	}

}
