package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendMessagePage {
	
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//div[@class='media-body']")
	WebElement clickonmessage;
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement clickonmessagetextbox;
	@FindBy(xpath="//i[@class='fa fa-reply']")
	WebElement clickreplybutton;
	@FindBy(xpath="//div[@class='box-content message-view']")
	WebElement beforescrollrandomclick;


	
	
	
	
	
	public QALegendMessagePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickOnAMessage() {
		clickonmessage.click();
		
	
		
	}
	public void clickOnMessageTextBoxArea(String message) throws InterruptedException {
		
		clickonmessagetextbox.click();
		Thread.sleep(1000);
		pageutilities.enterTextOnWebelement(clickonmessagetextbox, message);
		
	}
	public void clickOnReplyButton() throws InterruptedException {

		Thread.sleep(1000);
		beforescrollrandomclick.click();
		pageutilities.scrollPage();
		Thread.sleep(1000);
		pageutilities.clickUsingJavaScript(clickreplybutton);
	}
	
	}
	
	
	
	
	
	
	

