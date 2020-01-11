package com.excelDataReader;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.project.SeleniumMaven.BaseTest;

public class Again extends BaseTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\jasta\\Desktop\\data.xlsx");
		XSSFWorkbook xwb=new XSSFWorkbook(fis);
		XSSFSheet sheet = xwb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		/*String value1 = cell1.getStringCellValue();
		XSSFRow row2 = sheet.getRow(2);
		XSSFCell cell2 = row2.getCell(1);
		String value2 = cell2.getStringCellValue();
		//Date value = cell.getDateCellValue();
		//double value = cell.getNumericCellValue();
		System.out.println(value1);
		System.out.println(value2);
		init();
		launch("chromebrowser");
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(value1);
		driver.findElement(By.id("pass")).sendKeys(value2);
		driver.findElement(By.id("u_0_2")).click();
		xwb.close();
		fis.close();*/
	
			
	}

}
