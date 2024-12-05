package Testscript;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.QALegendHomePage;
import Utilities.FakerUtility;
import Utilities.PageUtilities;

public class QALegendClientsTest extends Base {
	public WebDriver driver;
	@Test
	public void editClientsDetials() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnClientsTitle();
		clientpage.clickOnAddClientButton();
		String companynameaddclient=properties.getProperty("companynameaddclient");
		clientpage.addClientTitleName(companynameaddclient);
		clientpage.clickOnSaveAddClientPage();
		clientpage.clickOnSearchButton(companynameaddclient);
		//clientpage.clickOnClientDetialSaveButton();
		clientpage.clickOnClientEditButton();
		clientpage.clearTextOnCompanyNameTextBox();
		String companynameaddclient1=properties.getProperty("companynameaddclient")+FakerUtility.randomNumberGenerator();
		clientpage.addClientTitleName(companynameaddclient1);
		clientpage.clickOnClientDetialSaveButton();
		Thread.sleep(2000);
		clientpage.clearTextOnSearchButtonOnClientPage();
		Thread.sleep(2000);
		clientpage.clickOnSearchButtonClientPage(companynameaddclient1);
		Assert.assertEquals(clientpage.getnewlyAddedcompayname(), companynameaddclient1);
		
		
		//Assert.assertEquals(notepage.getNewlyAddedTitle(), companyname);
		//clientpage.clickOnSearchTextBoxClient();
		}
	@Test
	
	public void addAlphabetZipCode() {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnClientsTitle();
		clientpage.clickOnClientEditButton();
		clientpage.clickOnZipTextBox(properties.getProperty("zip"));
		clientpage.clickOnClientDetialSaveButton();
		
	}

}
