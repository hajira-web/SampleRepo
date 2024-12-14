package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendInvoiceTest extends Base {
	public WebDriver driver;
	@Test(retryAnalyzer = Testscript.RetryAnalyser.class )
	public void invoicepayment() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickoninvoicetitle();
		invoicePage.clickonsettingbutton();
		invoicePage.clickOnAddPayment();
		invoicePage.clickondatetextbox();
		invoicePage.clickondatecalendar();
		invoicePage.clickonamount(properties.getProperty("amount"));
		invoicePage.clickOnSaveButton();
		
		
	}

}
