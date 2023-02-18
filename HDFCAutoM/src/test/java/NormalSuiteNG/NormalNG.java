package NormalSuiteNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NormalNG {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest-01");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Beforeclass-01");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("BforeMethod-01");
	}

	@Test
	public void test1 () {
	System.out.println("Test 1");
	}


	@Test
	public void test2 () {
	System.out.println("Test 2");
	}

	@AfterMethod
	public void afterMethod () {
	
	System.out.println("AfterMethod-01");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("AfterClass-01");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("AfterTest-01");
	}	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	
}
