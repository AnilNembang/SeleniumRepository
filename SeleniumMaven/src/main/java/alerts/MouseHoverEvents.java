package alerts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.project.SeleniumMaven.BaseTest;

public class MouseHoverEvents extends BaseTest{
	public static Actions a;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.snapdeal.com");
		//a=new Actions(driver);
		/*a.moveToElement(driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"))).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[2]/a")).click();
	    */
	/*	driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement draggable=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement droppable=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(draggable).clickAndHold(droppable).release().perform();
		Thread.sleep(4000);*/
/*		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//WebElement drag=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		WebElement rightClick=driver.findElement(By.id("resizable"));
		a=new Actions(driver);
		System.out.println(rightClick);
		Thread.sleep(4000);
		a.contextClick(rightClick).perform();
		//a.dragAndDropBy(drag, 100, 200).release(drag).build().perform();
		//a.clickAndHold(drag).moveByOffset(10, 20).release(drag).build().perform();
		System.out.println("performed");
		//a.dragAndDropBy(drag, 100, 100).perform();
*/		
		/*driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		a=new Actions(driver);
		a.dragAndDropBy(slider, 200, 0).perform();
		a.clickAndHold(slider).moveByOffset(200, 0).release(slider).build().perform()*/;
		
		/*driver.get("https://selenium.dev/downloads/");
		
		for(int i=0; i<10; i++) {
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}*/
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		String caughtValue=driver.findElement(By.name("q")).getAttribute("value");
     	System.out.println(caughtValue);
		Thread.sleep(3000);
		
		List<WebElement> optionList=driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div/div/span"));
		
		for(int i=0;i<optionList.size();i++) {
			if(optionList.get(i).equals(caughtValue)){
				optionList.get(i).click();
				return;//it exits from the method
			}
			optionList=driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div/div/span"));
		}
	}

}
