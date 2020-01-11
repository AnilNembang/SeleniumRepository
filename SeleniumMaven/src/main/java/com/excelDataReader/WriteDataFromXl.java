package com.excelDataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataFromXl {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		FileOutputStream fos=null;
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(4);
		
		XSSFFont font=workbook.createFont();
		font.setBold(true);
		font.setFontName("Algerian");
		font.setFontHeight(55);
		
		XSSFCellStyle style=workbook.createCellStyle();
		style.setFont(font);
		cell.setCellStyle(style);
		cell.setCellValue("Abort");
		
		fos=new FileOutputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		workbook.write(fos);
		fos.close();
		
	}

}
