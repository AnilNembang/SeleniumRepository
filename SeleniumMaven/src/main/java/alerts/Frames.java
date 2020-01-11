package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		driver.get("http://www.angelfire.com/super/badwebs/");
		
		driver.switchTo().frame(driver.findElement(By.name("contents")));
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	}

}
