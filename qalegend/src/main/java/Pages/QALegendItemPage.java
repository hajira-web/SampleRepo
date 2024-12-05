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

	
	
	
	
	
	
	
	public QALegendItemPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickOnDeleteButton() {
		clickdeletebutton.click();
	}
	
	
	
	

}






