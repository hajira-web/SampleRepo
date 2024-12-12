package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendProjectPage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(xpath="//div[@class='title-button-group']//child::a")
	WebElement addprojectbutton;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement titletextbox;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebutton_projectpage;
	@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement searchbutton_projectpage;
	@FindBy(xpath="(//td[@class=' w50']//following::a)[1]")
	WebElement newlyaddedtitle_projectpage;
	
	
	
	
	
	
	
		public QALegendProjectPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
		
		public void clickOnAddProjectButton() {
			addprojectbutton.click();
		}
		
		public void enterTextOnTitleTextBox(String titleproject) {
			pageutilities.enterTextOnWebelement(titletextbox, titleproject);
		}
		public void clickOnSaveButton() {
			savebutton_projectpage.click();
		}
		public void clickOnSearchButton(String titleproject) throws InterruptedException {
			Thread.sleep(2000);
			searchbutton_projectpage.sendKeys(titleproject);
		}
		public String getNewlyAddedTitleProject() {
			String titleproject =newlyaddedtitle_projectpage.getText();
			return titleproject;
		}
		
		
		
		
		
		
		
		
		
		
	}








