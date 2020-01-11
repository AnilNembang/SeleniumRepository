package alerts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.project.SeleniumMaven.BaseTest;

public class HtmlAlertHandeling extends BaseTest{
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("535223452");	
		driver.findElement(By.name("submit")).click();
		Alert al=driver.switchTo().alert();
		String actualText=al.getText();
		String expectedText="Do you really want to delete this Customer?";
		Assert.assertEquals(actualText, expectedText);
		al.accept();
	}

}
