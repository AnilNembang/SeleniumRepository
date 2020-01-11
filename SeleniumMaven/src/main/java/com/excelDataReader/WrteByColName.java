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

public class WrteByColName {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		FileOutputStream fos=null;
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell=null;
		
		int colNumber = 0;
		
		for(int i=0; i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().trim().equals("Result")) {
				colNumber=i;
			}
		}
		row=sheet.getRow(2);
		cell=row.getCell(colNumber);
		
		XSSFFont font=workbook.createFont();
		font.setBold(true);
		font.setFontName("Algerian");
		font.setFontHeight(16);
		
		XSSFCellStyle style=workbook.createCellStyle();
		style.setFont(font);
		cell.setCellStyle(style);
		cell.setCellValue("FromName");
		
		fos=new FileOutputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		workbook.write(fos);
		fos.close();
	}

}
