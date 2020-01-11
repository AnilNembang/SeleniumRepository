package alerts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.project.SeleniumMaven.BaseTest;

public class BootStrapAlert extends BaseTest{
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		driver.get("https://www.nibl.com.np/");
		driver.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("#showimage > table > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > a")).click();
		
	}

}
