package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.project.SeleniumMaven.BaseTest;

public class NotificationAlerts extends BaseTest{
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("C:\\Users\\jasta\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		driver.get("--disable-notifications");
		driver.get("https://www.axisbank.com/");
	}
}
