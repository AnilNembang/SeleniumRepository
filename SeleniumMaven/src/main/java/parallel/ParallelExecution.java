package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class ParallelExecution {
	public static void main(String[] args) {
		TestNG testng=new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//combo.xml"}));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
	}

}
