package alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.SeleniumMaven.BaseTest;

public class TestWindowsFrame extends BaseTest{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
	String parentWindow=driver.getWindowHandle();
	driver.findElement(By.cssSelector("#sc-lb-module-product-masthead > div.content > div > div > div > ul.buttons > li > a")).click();
	
	Set<String> multiWindows=driver.getWindowHandles();
	Iterator<String> itr = multiWindows.iterator();
	while(itr.hasNext()) {
		String currentWindow=itr.next();
		if(!currentWindow.equals(parentWindow)) {
			driver.switchTo().window(currentWindow);
		}
	}
	
	
	
}

}
