package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendClientsPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement addclientbutton;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement clickonclientsavebutton;
	@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement clicksearchbuttonclient;
	@FindBy(xpath="(//a[@class='edit'])[1]")
	WebElement clickclienteditbutton;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement companynametextbox;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement clientdetialsavebutton;
	@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement clientsearchbutton;
	@FindBy(xpath="//table[@class='display dataTable no-footer']//descendant::a")
	WebElement newlyaddedcompanyname;
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement clickziptextbox;
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement editedzip;
	
	
public QALegendClientsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}


public void clickOnAddClientButton() {
	addclientbutton.click();
	}
public void clickOnSaveAddClientPage() {
	clickonclientsavebutton.click();
}
public void clickOnSearchButton(String companynameaddclient) throws InterruptedException {
	Thread.sleep(1000);
pageutilities.clickUsingJavaScript(clicksearchbuttonclient);
pageutilities.enterKeyPress();
pageutilities.enterTextOnWebelement(clicksearchbuttonclient, companynameaddclient);

}
public void clearTextOnCompanyNameTextBox() {
	companynametextbox.clear();
}
public void clickOnClientEditButton() {
		clickclienteditbutton.click();
	}
public void addClientTitleName(String companyname){
	pageutilities.enterTextOnWebelement(companynametextbox, companyname);
}
public void clickOnClientDetialSaveButton() {
	clientdetialsavebutton.click();
}
public void clickOnZipTextBox(String zip) {
	pageutilities.clickUsingJavaScript(clickziptextbox);
	pageutilities.enterTextOnWebelement(clickziptextbox, zip);
}
public void clickOnSearchButtonClientPage(String companynameaddclient1){
	clientsearchbutton.sendKeys(companynameaddclient1);	
	}

public void clearTextOnSearchButtonOnClientPage() throws InterruptedException {
Thread.sleep(2000);
	clientsearchbutton.clear();
}


public String getnewlyAddedcompayname() {
	String companyname=newlyaddedcompanyname.getText();
	return companyname;
}

public String  getEditedZip() {
	String editedzip1=editedzip.getText();
	return editedzip1;
}
}
