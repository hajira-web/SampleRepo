package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLeavePage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath = "(//a[@class='edit'])[1]")
	WebElement clickoneditbutton;
	@FindBy(xpath="//span[@class='fa fa-check-circle-o']//parent::button")
	WebElement clickonapprovebutton;
	
	
	
	public QALegendLeavePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}



	public void clickeditbutton() {
		clickoneditbutton.click();
	}
	public void clickapprovebutton() {
		clickonapprovebutton.click();
	}
	


}


