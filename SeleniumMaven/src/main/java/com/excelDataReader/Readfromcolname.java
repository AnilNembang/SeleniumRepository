package com.excelDataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfromcolname {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell=null;
		int colNumber=0;
		
		for(int i=0;i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().trim().equals("Password")){
				colNumber=i;
			}

		}
		row=sheet.getRow(4);
		cell=row.getCell(colNumber);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}
