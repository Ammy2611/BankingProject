package NormalSuiteNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Normal2NG {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest");
	}
	
	
	@BeforeClass
	public void beforeClass2() {
		System.out.println("Beforeclass-2");
	}
@BeforeMethod
public void beforeMethod2() {
	System.out.println("BforeMethod-2");
}

@Test
public void test1 () {
	System.out.println("TEST A");
	String actualURl="https://www.facebook.com";
	String expectedURl="https://www.facebook.com123";
//	Assert.assertEquals(actualURl, expectedURl,"Failure Massege Writing"); 
	
//	Assert.assertNotEquals(actualURl, expectedURl,"Failure Massege Writing");
	
	
	boolean result=actualURl.equals(expectedURl);
	Assert.assertTrue(result);
	
	
	
	
	
	
}


@Test
public void test2 () {
	System.out.println("TEST B");
}

@Test
public void test3 () {
	System.out.println("TEST C");
}
@Test
public void test4 () {
	System.out.println("TEST D");
}


@AfterMethod
public void afterMethod2 () {
	
	System.out.println("AfterMethod-2");
}
@AfterClass
public void afterClass2() {
	System.out.println("AfterClass-2");
}
@AfterTest
public void Aftertest() {
	System.out.println("AfterTest");
}	
@AfterSuite
public void afterSuite() {
	System.out.println("AfterSuite");
}

	
	

}
