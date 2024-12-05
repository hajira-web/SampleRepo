package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class qaLegentLoginPage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(id = "email")
	 WebElement userNameField;
	 @FindBy(id = "password")
	 WebElement passwordField;
	 @FindBy(xpath = "//button[@class ='btn btn-lg btn-primary btn-block mt15']")
	 WebElement signInButton;
	 
	 
	 
	 
	 
public qaLegentLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	this.pageutilities=new PageUtilities(driver);
	PageFactory.initElements(driver, this);
	}






public void loginToQaLegend(String username,String password) {
	pageutilities.enterTextOnWebelement(userNameField, username);
	pageutilities.enterTextOnWebelement(passwordField, password);
	pageutilities.ClickOnElement(signInButton);
	}
	 
}




