package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendMessagePage {
	
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="(//a[@class='list-group-item'])[1]")
	WebElement clickcomposemessage;
	@FindBy(xpath="//div[@class='select2-container select2 validate-hidden']")
	WebElement clicktorecipient;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement clicksubjecttextbox;
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement clickmessagetextbox;
	@FindBy(xpath="//span[@class='fa fa-send']")
	WebElement clicksentbutton;
	@FindBy(xpath="(//a[@class='list-group-item'])[3]")
	WebElement clicksentitems;
	@FindBy(xpath="(//div[@class='media-body'])[1]")
	WebElement newlyaddedsubject;
	@FindBy(xpath="(//input[@class='select2-input'])[2]")
	WebElement messages_to_dropdown_textbox;


	
	public QALegendMessagePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnComposeMessage() {
		clickcomposemessage.click();
	}
	public void clickOnToRecipient() throws InterruptedException
	
	{Thread.sleep(1000);
	pageutilities.clickUsingJavaScript(clicktorecipient);
	}
	
	public void selectValueMessageToDropDown(String messagepage_to_name) throws InterruptedException {
		Thread.sleep(1000);
		pageutilities.enterTextOnWebelement(messages_to_dropdown_textbox,messagepage_to_name);
		pageutilities.enterKeyPress();
		
	}

	public void clickOnSubjectTextbox(String subject) throws InterruptedException {
		Thread.sleep(1000);
		pageutilities.enterTextOnWebelement(clicksubjecttextbox, subject);
	}
	public void clickOnMessageTextBox() {
		clickmessagetextbox.sendKeys("Please");
	}
	public void clickOnSentButton() throws InterruptedException {
		Thread.sleep(2000);
		pageutilities.clickUsingJavaScript(clicktorecipient);
	}
	public void clickOnSentItems() throws InterruptedException {
		Thread.sleep(4000);
		clicksentitems.click();
	}
	public String getnewlyAddedSubject() throws InterruptedException {
		Thread.sleep(2000);
		String subject=newlyaddedsubject.getText();
		return subject;
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	/*public void clickOnAMessage() {
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
	public void ClickOnSentItems() {
		sentitemsclick.click();
	}*/
	
	
	}
	
	
	
	
	
	
	

