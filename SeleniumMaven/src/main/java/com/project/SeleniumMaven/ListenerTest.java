package com.project.SeleniumMaven;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTest extends BaseTest implements ITestListener{
	public void onTestStart(ITestResult obj1) {
		Reporter.log("Test case is initiated"+obj1.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult obj2) {
		if(obj2.isSuccess()) {
			try {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//success//"+screenshotFileName));
			} catch (Exception e) {
				e.printStackTrace();
			}
			Reporter.log("<a href='" + System.getProperty("user.dir")+"//success//"+screenshotFileName + "'> <img src='" + System.getProperty("user.dir")+"//success//"+screenshotFileName+ "'height='100' width='100'/></a>");
			Reporter.log("Test Has Passed: " + obj2.getMethod().getMethodName() );
		}
	
	}

	public void onTestFailure(ITestResult result) {
		if(!result.isSuccess()) {
			try {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//failure//"+screenshotFileName));
			} catch (Exception e) {
				e.printStackTrace();
			}
			Reporter.log("<a href='" + System.getProperty("user.dir")+"//failure//"+screenshotFileName + "'> <img src='" + System.getProperty("user.dir")+"//failure//"+screenshotFileName+ "'height='100' width='100'/></a>");
			Reporter.log("Test Has failed: " + result.getMethod().getMethodName() );
		}
		
	}

	public void onTestSkipped(ITestResult obj3) {
		Reporter.log("Test case skipped" + obj3.getMethod().getMethodName());
	
	}

}
