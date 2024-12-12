package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEstimatePage {

public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement createestimaterequest;
	@FindBy(xpath="(//li[@class='list-group-item']//descendant::a")
	WebElement selectaformfrompopuppage;
	@FindBy(xpath="//div[@class='select2-container select2 validate-hidden']")
	WebElement addclienttextbox;
	@FindBy(xpath="//input[@class='select2-input']")
	WebElement selectfromdropdownaddclienttextbox;
	
	
	//webelemets for estimateform
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement addform_estimatespage;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement titletextbox_estimateform;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebutton_addform;
	/*@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement searchbutton_addformpage;*/
	@FindBy(xpath="//h3[@class='pull-left']")
	WebElement newlyaddedtitle_addformpage;
	
	
	
public QALegendEstimatePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
public void clickOnCreateEstimateRequest() {
	pageutilities.clickUsingJavaScript(createestimaterequest);
}
public void clickOnSelectAFormFromPopUpPage() throws InterruptedException {
	Thread.sleep(2000);
	pageutilities.clickUsingJavaScript(selectaformfrompopuppage);
}
/*public void clickOnAddClientTextbox() throws InterruptedException {
	Thread.sleep(1000);
	addclienttextbox.click();
}*/
public void clickOnDropdownTextBoxAddClient() {
	selectfromdropdownaddclienttextbox.sendKeys("123");
}

//methods estimateformpage


public void clickOnAddFormButtonEstimateForm() {
	addform_estimatespage.click();
}
public void enterTextOnAddFormTitle(String titleaddform) throws InterruptedException {
	Thread.sleep(1000);
	pageutilities.enterTextOnWebelement(titletextbox_estimateform, titleaddform);
}
public void clickOnSaveButtonAddForm() {
	savebutton_addform.click();
}
/*public void clickOnSearchButtonAddFormPage(String titleaddform) throws InterruptedException {
	Thread.sleep(1000);
	searchbutton_addformpage.sendKeys(titleaddform);
}*/

public String getNewlyAddedTitleAddFormPage() {
String titleaddform=newlyaddedtitle_addformpage.getText();
return titleaddform;
}

}
