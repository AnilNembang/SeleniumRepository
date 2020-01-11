package parallel;

import org.testng.annotations.Test;

import junit.framework.Assert;import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestDependency {
  @Test(priority=1)
  public void orange() {
	  System.out.println("this is orange");
  }
  @Test(priority=2, dependsOnMethods= {"orange"})
  public void white() {
	  System.out.println("this is white");
  }
  @Test(priority=3, dependsOnMethods= {"white"})
  public void blue() {
	  System.out.println("this is blue");
	  //throw new SkipException("blue is skipped");//throw new SkipException will sikip the method
	  Assert.fail("blue is failed");
  }
  @Test(priority=4, dependsOnMethods= {"blue"})
  public void green() {
	  System.out.println("this is green");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
