package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendTicketsPage {
	
public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//div[@class='title-button-group']//child::a")
	WebElement clickaddticket;
	@FindBy(xpath="(//div[@class=' col-md-9']//descendant::input)[1]")
	WebElement titletextbox;
	@FindBy(xpath="//div[@class=' col-md-9']//descendant::textarea")
WebElement descriptiontextbox;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement clicksavebutton;
	@FindBy(xpath="//div[@class='dataTables_filter']//descendant::input")
	WebElement clicksearchbox;
	@FindBy(xpath="//td[@class=' w10p']//following::a")
	WebElement newlyaddedtitleticket;
	

	
	public QALegendTicketsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickOnAddTicket() {
		clickaddticket.click();
	}
	public void enterTitle(String titleticket) throws InterruptedException {
		Thread.sleep(1000);
		titletextbox.click();
		Thread.sleep(1000);
		pageutilities.enterTextOnWebelement(titletextbox, titleticket);
	}

	public void enterTextonDescription() throws InterruptedException {
		Thread.sleep(1000);
		descriptiontextbox.click();
		Thread.sleep(1000);
		descriptiontextbox.sendKeys("Urgent");
	}
	
	public void clicOnSaveButton()
	{
		clicksavebutton.click();
	}
	public void clicOnSearchBox(String titleticket) throws InterruptedException
	{
		Thread.sleep(1000);
		clicksearchbox.click();
		Thread.sleep(1000);
		clicksearchbox.sendKeys(titleticket);
	}	
	public String getNewlyAddedTitleTicket()
	{
		String titleticket=newlyaddedtitleticket.getText();
		return titleticket;
	}	
	


}
