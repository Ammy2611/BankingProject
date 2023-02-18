package ProjectL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HdfcPomClass.ApplyCreditC;


public class HdfcTestClass {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","D:\\Velocity Class material\\Selenium Auto\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.hdfcbank.com/");
	
	ApplyCreditC applyCreditC  = new ApplyCreditC(driver);
	

	applyCreditC.ActionPay();
	
	applyCreditC.ClickOnCreditC();
	
	applyCreditC.Lifestyle();
	
	applyCreditC.SuggestCreditCardB();
	
	applyCreditC.ClickOnApply();
	
}}
