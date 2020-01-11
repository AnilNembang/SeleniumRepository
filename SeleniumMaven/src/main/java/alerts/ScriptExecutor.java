package alerts;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import com.project.SeleniumMaven.BaseTest;

public class ScriptExecutor extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//js.executeScript("document.getElementById('email').value='matikagurung@gmail.com'");
		//js.executeScript("window.scrollBy(0,200)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

		
		
		
	}

}
