package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendItemPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	
	@FindBy(xpath="//i[@class='fa fa-times fa-fw']")
	WebElement clickdeletebutton;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement additemsbutton;
	@FindBy(xpath="//input[@class='form-control validate-hidden']")
	WebElement titletextbox;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement ratetextbox;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebuttonadditem;
	@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement searchtextbox;
	@FindBy(xpath="//td[@class=' w20p']")
	WebElement newlyaddedtitle;
	
	@FindBy(xpath="//tr[@class='odd']")
	WebElement deletedtitle;
	

	public QALegendItemPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickOnDeleteButton() {
		clickdeletebutton.click();
	}
	public void clickOnAddItemsButton() {
		additemsbutton.click();
	}
	public void enterTextOnTitleTextBox(String titleadditem) {
		pageutilities.enterTextOnWebelement(titletextbox, titleadditem);
		
}
	public void enterRateOnRateTextBox () {
		ratetextbox.sendKeys("1000");
	}
	public void clickOnSaveButtonAddItem() {
		savebuttonadditem.click();
	}
	public void enterNewlyAddedTitleOnSearchBox(String titleadditem) throws InterruptedException {
		Thread.sleep(2000);
	searchtextbox.sendKeys(titleadditem);	
	}
	public String getNewlyAddedTitle() {
		String titleadditem=newlyaddedtitle.getText();
		return titleadditem;
	}
	public String getDeletedTitle() {
		String deletedtitle1=deletedtitle.getText();
		return deletedtitle1;
	}
	
	
		
	}
	
	
	
	
	








