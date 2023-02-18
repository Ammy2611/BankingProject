package HdfcPomClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyCreditC {
	
   WebDriver driver;
	
	@FindBy(xpath="(//a[@data-linktype='menuHeader'])[10]")
	private WebElement ActionOnPay;
	
	@FindBy(xpath="(//span[text() ='Credit Cards'])[3]")
	private WebElement ClickOnCreditC;
	

	@FindBy(xpath="(//input[@value='Lifestyle'])[1]")
	private WebElement ClickOnLifstyle ;
	
	@FindBy(xpath="//a[@title='SUGGEST CREDIT CARDS']") 
	private WebElement SuggestCreditCardB ;
	
	@FindBy(xpath="(//a[@title='APPLY ONLINE'])[18]") 
	private WebElement clickOnAPPLY ;
	
	
	public ApplyCreditC (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void ActionPay() {
	JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("window.scrollBy(0,600)");
	
		Actions Act = new Actions (driver);
		Act.moveToElement(ActionOnPay).click().build().perform();
				
	}
	
	public void ClickOnCreditC() {

		ClickOnCreditC.click();
		
	}	
	public void Lifestyle() {
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("window.scrollBy(0,300)");
	
		ClickOnLifstyle.click();
	}
	
		
	public void SuggestCreditCardB() {
		SuggestCreditCardB.click();
	}
		
	public void ClickOnApply() {
	JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("window.scrollBy(0,800)");
	
		clickOnAPPLY.click();
	
	
	}
		
}


