package alerts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.project.SeleniumMaven.BaseTest;

public class NotificationAlert extends BaseTest {
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		driver.get("https://bananarepublic.gap.com/");
		//driver.findElement(By.cssSelector("#app > div:nth-child(14) > div > div > div > div > div.universal-modal__header > button")).click();
		driver.findElement(By.cssSelector("#topNavWrapper > div.topnav-container.sds_g-1-1 > ul > li:nth-child(3) > a")).click();
	
	}

}
