package HdfcPomClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyForLon {
	
	WebDriver driver;
	

	@FindBy(xpath="(//a[@data-linktype='menuHeader'])[13]")
	private WebElement BORROW;
	
    @FindBy (xpath = "(//span[text()='Loan on Credit card'])[2]")
   private WebElement ClickOnLon;
    
    @FindBy (xpath = "(//a[@title='APPLY ONLINE'])[1]")
    private WebElement Apply ;
    
//     WebDriverWait wait1= new WebDriverWait (driver,20);
	
   public ApplyForLon (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void ClickOnBorrow() {
		Actions Act = new Actions (driver);
		Act.moveToElement(BORROW).click().build().perform();
		BORROW.click();		
	}
	
	public void ClickOnLonAndCredit() throws InterruptedException {
		 JavascriptExecutor Js = (JavascriptExecutor)driver;
			
//			Js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
		ClickOnLon.click();
	}
	
	public void ClickOnApply() throws InterruptedException {
		 JavascriptExecutor Js = (JavascriptExecutor)driver;
			
			Js.executeScript("window.scrollBy(0,600)");
		
			Thread.sleep(1000);
		Apply.click();
	}
	
	
	
}
