package parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AutoIt {
	WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
  }
  
  @Test
  public void f() throws InterruptedException, IOException {
	  
	 driver.findElement(By.id("identifierId")).sendKeys("matikagurung@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	 driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("luckyseven");
	 //driver.findElement(By.id("identifierNext")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	 Thread.sleep(8000);
	  driver.findElement(By.xpath("//*[@id=\":jz\"]/div/div")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\":pk\"]")).sendKeys("jfkaj@gmai.com");
	  driver.findElement(By.xpath("//*[@id=\":qi\"]")).click();
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\jasta\\Desktop\\upload.exe");
	  Thread.sleep(5000);
	  driver.findElement(By.id(":pk")).sendKeys("anilnembang99@gmail.com");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\":p2\"]")).sendKeys("Sample Subject");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\":os\"]")).click();

  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
