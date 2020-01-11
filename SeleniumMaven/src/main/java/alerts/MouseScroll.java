package alerts;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.project.SeleniumMaven.BaseTest;

public class MouseScroll extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		driver.get("https://selenium.dev/");
		//Thread.sleep(4000);
		
		
		for(int i=0;i<10;i++) {
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}
	}
}
