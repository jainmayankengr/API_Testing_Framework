package testngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnotations {
	
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
		System.out.println("Before Suite---");
	}

	
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test---");
	}
	
	@BeforeClass
	public void BeforeClassMethod()
	{
		System.out.println("Before Class---");
	}
	
	@BeforeMethod	
	public void BeforeMethod_Method()
	{
		System.out.println("Before Method---");
	}
	
	@Test(priority=2)
	public void Test1()
	{
		System.out.println("Test1 Method-----");
	}
	
	@AfterMethod	
	public void AfterMethod_Method()
	{
		System.out.println("After Method---");
	}	
	
	@AfterClass
	public void AfterClassMethod()
	{
		System.out.println("After Class---");
	}
	
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("After Test-----");
	}
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
		System.out.println("After Suite-----");
	}
	
	@Test(priority = 1)
	public void Test2()
	{
		System.out.println("Test2 Method-----");
	}
	
}
