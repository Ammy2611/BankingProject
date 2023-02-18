package ProjectL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import HdfcPomClass.ApplyForLon;

public class LonOnCredit {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\Velocity Class material\\Selenium Auto\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
	
		ApplyForLon applyForLon= new ApplyForLon(driver);
		
	
		applyForLon.ClickOnBorrow();
		
		applyForLon.ClickOnLonAndCredit();
		
		applyForLon.ClickOnApply();
		
		
}}
