package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P1 {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("from Before suite");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("from After suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("from Before Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("from After test");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("from Before Method");
	}

	@AfterMethod

	public void AfterMethod() {
		System.out.println("from After method");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("from Before class");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("from After class");
	}

	@Test
	public void script() {
		System.out.println("from script");
	}

}
