package WindowsFrame;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandler {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent windows: "+parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"sc-lb-module-product-masthead\"]/div[2]/div/div/div/ul[2]/li/a")).click();
		
		Set<String> multiwindows=driver.getWindowHandles();
		Iterator<String> itr = multiwindows.iterator();
		
		while(itr.hasNext()) {
			String currentWindow=itr.next();
			if(!currentWindow.equals(parentWindow)) {
				driver.switchTo().window(currentWindow);
			}
				
		}
		
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(8000);
	
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/a/img")).click();
	
	}


}
