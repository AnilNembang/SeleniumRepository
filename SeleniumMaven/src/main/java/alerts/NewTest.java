package alerts;

import org.testng.annotations.Test;

import com.project.SeleniumMaven.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest extends BaseTest{
  
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String btype) throws IOException, InterruptedException {
	  	test=reports.startTest("NewTest");
		
		init();
		test.log(LogStatus.PASS, "Initializing properties files.....");
		
		launch(btype);
		test.log(LogStatus.PASS, "Opened the browser :- " + p.getProperty("chromebrowser"));
		
		
		navigateUrl("guru99url");
		test.log(LogStatus.PASS, "Navigated to url :- " + p.getProperty("guru99url"));
		Thread.sleep(4000);
		driver.manage().window().maximize();
	  
  }
  
  @Test
  public void amazon() throws InterruptedException {
	  	/*selectOption("guru99_name","guru99text");
		test.log(LogStatus.PASS, "Selected the option :- " + or.getProperty("guru99text") + "  by using the locator :- " + or.getProperty("guru99_name"));
		*/
		typeValue("guru99_name","guru99text");
		test.log(LogStatus.PASS, "Entered the text :- "+ or.getProperty("guru99text") + " by using the locator :- " + or.getProperty("guru99_name"));
		
		clickElement("guru99submitbutton_name");
		test.log(LogStatus.PASS, "Clicked on element by using locator :- " + or.getProperty("guru99submitbutton_name"));
		Thread.sleep(4000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		String expValue="Do you really want to delete this Customer?";
		Assert.assertEquals(al.getText(), expValue);
		al.accept();
  }

  @AfterMethod
  public void afterMethod() {
	  	driver.close();
	  	reports.endTest(test);
	  	reports.flush();
  }

}
