package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendTicketsPage {
	
public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle  mt0 mb0']")
	WebElement clicksettingsbutton;
	@FindBy(xpath="(//a[@class='delete'])[1]")
	WebElement clickdeletebutton;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement clickdeletesurebutton;
	
	
	public QALegendTicketsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void cliclOnSettingButton() {
		clicksettingsbutton.click();
	}
	public void clickOnDeleteButton() {
		clickdeletebutton.click();
	}
	public void clickOnDeleteSureButton() throws InterruptedException {
		Thread.sleep(2000);
		clickdeletesurebutton.click();
	}

}
