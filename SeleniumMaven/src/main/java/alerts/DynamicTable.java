package alerts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.project.SeleniumMaven.BaseTest;

public class DynamicTable extends BaseTest{
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String row="//*[@id=\\\"leftcontainer\\\"]/table/tbody/tr";
		int rowData = driver.findElements(By.xpath(row)).size();
		System.out.println(rowData);
		String column="//*[@id=\"leftcontainer\"]/table/tbody/tr/td";
		int colData = driver.findElements(By.xpath(column)).size();
		System.out.println(colData);
		for(int i=1; i<=rowData; i++) {
			for(int j=1; j<colData; j++) {
				String firstpart="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
				String secondpart="]/td[";
				String thirdpart="]";
				String finalpart=firstpart+i+secondpart+j+thirdpart;
				String text=driver.findElement(By.xpath(finalpart)).getText();
				System.out.println(text+"|");
			}
			System.out.println();
		}
		
	}

}
