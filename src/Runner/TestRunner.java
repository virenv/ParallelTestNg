package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
	      	List<String> suites = new ArrayList<String>();
	      	 TestNG testng = new TestNG();
	        suites.add(".\\CompleteSuite.xml");
			testng.setTestSuites(suites);
	        testng.setParallel("parallel");
	        testng.setSuiteThreadPoolSize(5);
	        testng.setOutputDirectory("path to output");
	        testng.run();

	}

}
