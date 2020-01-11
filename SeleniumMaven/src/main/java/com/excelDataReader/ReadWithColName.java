package com.excelDataReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWithColName {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell =null;
		int colNumber=0;
		
		for(int i=0;i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().trim().equals("Password")) {
				colNumber=i;
				System.out.println(colNumber);
			}
			row=sheet.getRow(4);
			cell=row.getCell(colNumber);
			String value = cell.getStringCellValue();
			//double value = cell.getNumericCellValue();
			System.out.println(value);
			workbook.close();
			fis.close();
		}
		
		
	}

}
