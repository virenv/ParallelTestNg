package TestClasses;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Factory.ObjectFactory;

public class TestClass001 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite TestClass001, ThreadId " + Thread.currentThread().getId());
	}
	
	@Test
	public void TestClass001_001()
	{
		Reporter.log("This is Test Case001 of class 001 at level 1", 1);
		Reporter.log("This is Test Case001 of class 001 at level 2 and logged to standard out", 2, true);
		System.out.println("Thread Id of TestClass001_001 is " + Thread.currentThread().getId());
		System.out.println("Reporter ID of the TestClass001_001 thread is " + ObjectFactory.getReporter());
	}
	
	@Test
	public void TestClass001_002()
	{
		Reporter.log("This is Test Case002 of class 001 at level 1", 1);
		Reporter.log("This is Test Case002 of class 001 at level 2 and logged to standard out", 2, true);
		System.out.println("Thread Id of TestClass001_002 is " + Thread.currentThread().getId());
		System.out.println("Reporter ID of the TestClass001_002 thread is " + ObjectFactory.getReporter());
	}

}
