package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendInvoicePage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath="(//i[@class='fa fa-cogs']//parent::button)[1]")
	WebElement clicksettingbutton;
	@FindBy(xpath="(//i[@class='fa fa-plus-circle']//parent::a)[4]")
	WebElement clickaddpayment;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement clickpaymentdatetextbox;
	@FindBy(xpath="//td[@class='today day']")
	WebElement clickdatecalendar;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement clickamount;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebuttonpress;
	
	
	
	
	
	
	public QALegendInvoicePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
public void clickonsettingbutton() {
	pageutilities.clickUsingJavaScript(clicksettingbutton);
		
	}
public void clickOnAddPayment() {
	pageutilities.clickUsingJavaScript(clickaddpayment);
}
public void clickondatetextbox() {
	clickpaymentdatetextbox.click();
}
public void clickondatecalendar() {
	clickdatecalendar.click();
}
public void clickonamount(String amount) throws InterruptedException {
pageutilities.clickUsingJavaScript(clickamount);
pageutilities.enterTextOnWebelement(clickamount, amount);
	}
public void clickOnSaveButton() {
	savebuttonpress.click();
}



	}
