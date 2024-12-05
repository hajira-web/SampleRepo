package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendHomePage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath="//span[text()='Notes']")
WebElement dashboard_notesbutton;
	@FindBy(xpath= "//i[@class='fa fa-sign-out font-16']")
	WebElement clickleavetitle;
	@FindBy(xpath="//i[@class='fa fa-file-text']")
			WebElement clickinvoicetitle; 
	@FindBy(xpath="//i[@class='fa fa-list-ul']")
	WebElement clickitemstitle;
	@FindBy(xpath="//i[@class='fa fa-briefcase']")
	WebElement clickclientstitle;
	@FindBy(xpath="//i[@class='fa fa-file']//parent::a")
WebElement clickestimatetitle;
	@FindBy(xpath="(//i[@class='dot fa fa-circle'])[5]")
	WebElement clickestimatelist;
	@FindBy(xpath="//i[@class='fa fa-envelope']")
	WebElement clickmessagestitle;
	@FindBy(xpath="//i[@class='fa fa-life-ring']")
	WebElement clickticketstitle;
	@FindBy(xpath="(//i[@class='dot fa fa-circle'])[6]")
	WebElement clickestimaterequest;






	
	
	
	
	
	public QALegendHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}






	public void clickOnDashBoardNotesButton() {
		dashboard_notesbutton.click();
		}
public void clickOnLeaveTitle() {
    clickleavetitle.click();
}
public void clickoninvoicetitle() {
	clickinvoicetitle.click();
} 
public void clickOnItemsTitle() {
	clickitemstitle.click();
}
public void clickOnClientsTitle() {
	clickclientstitle.click();
}
public void clickOnEstimateTitle() {
	clickestimatetitle.click();
}
public void clickOnEstimateListTitle() {
	clickestimatelist.click();
}
public void clickOnMessagesTitle() {
	clickmessagestitle.click();
}
public void clickOnTicketsTitle() {
	clickticketstitle.click();
}
public void clickOnEstimateRequest() {
	clickestimaterequest.click();
}
	
}
