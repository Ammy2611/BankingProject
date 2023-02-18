package HDFCtestNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HdfcPomClass.ApplyCreditC;
import HdfcPomClass.ApplyForLon;


public class HdfcNGClass {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
//@BeforeClass
	public void openBrowser(String browserName) {
		if (browserName.equals("Chrome")) {
System.setProperty("webdriver.chrome.driver","D:\\Velocity Class material\\Selenium Auto\\chromedriver.exe");
	
	 driver= new ChromeDriver();
		}
		if (browserName.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","D:\\Fierfox\\geckodriver.exe");
				
			 driver= new FirefoxDriver();
			}
		
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.hdfcbank.com/");
//		ApplyCreditC applyCreditC  = new ApplyCreditC(driver);

	}
	@Test 
	public void applyCreditC() throws InterruptedException {
		ApplyCreditC applyCreditC  = new ApplyCreditC(driver);
		

		applyCreditC.ActionPay();
		
		applyCreditC.ClickOnCreditC();
		
		applyCreditC.Lifestyle();
		
		applyCreditC.SuggestCreditCardB();
		Thread.sleep(3000);

		applyCreditC.ClickOnApply();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String titel=driver.getTitle();
		System.out.println(titel);
		String expectedURl="https://www.hdfcbank.com/personal/pay/cards/credit-cards";
		String expectedTitel="Credit Card - Apply for Best Credit Cards online in India | HDFC Bank";
		
		if (url.equals(expectedURl) && titel.equals(expectedTitel))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@Test
	public void creditLon() throws InterruptedException {
		
		ApplyForLon applyForLon= new ApplyForLon(driver);
		
		
		applyForLon.ClickOnBorrow();
		Thread.sleep(2000);

		applyForLon.ClickOnLonAndCredit();
	
		applyForLon.ClickOnApply();

		String url=driver.getCurrentUrl();
		System.out.println(url);
		String titel=driver.getTitle();
		System.out.println(titel);
		String expectedURl="https://www.hdfcbank.com/personal/borrow/loan-against-assets#/loan-on-credit-card";
		String expectedTitel="Loans against Assets - Get Loan Against Assets Online at HDFC Bank";
		
		if (url.equals(expectedURl) && titel.equals(expectedTitel))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@AfterMethod
	public void closeTab() {
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
//	@AfterClass
	@AfterTest
	public void closeWeb1() {
//		driver.close();
		driver.quit();
	}
	

}
