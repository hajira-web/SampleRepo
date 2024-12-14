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
		clientpage.clickOnClientEditButton();
		clientpage.clearTextOnCompanyNameTextBox();
		String companynameaddclient1=properties.getProperty("companynameaddclient")+FakerUtility.randomNumberGenerator();
		clientpage.addClientTitleName(companynameaddclient1);
		clientpage.clickOnClientDetialSaveButton();
		clientpage.clearTextOnSearchButtonOnClientPage();
		clientpage.clickOnSearchButtonClientPage(companynameaddclient1);
		Assert.assertEquals(clientpage.getnewlyAddedcompayname(), companynameaddclient1);
		
		
		
		}
	@Test
	
	public void addAlphabetZipCode() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnClientsTitle();
		clientpage.clickOnAddClientButton();
		String companynameaddclient2=properties.getProperty("companynameaddclient2")+FakerUtility.randomNumberGenerator();
		clientpage.addClientTitleName(companynameaddclient2);
		clientpage.clickOnSaveAddClientPage();
		clientpage.clickOnSearchButton(companynameaddclient2);
		clientpage.clickOnClientEditButton();
		String zip=properties.getProperty("zip")+FakerUtility.randomNumberGenerator();
		clientpage.clickOnZipTextBox(zip);
		clientpage.clickOnSaveAddClientPage();
	    Thread.sleep(1000);
		clientpage.clickOnClientEditButton();
		Assert.assertEquals(clientpage.getEditedZip(), zip);
		
		
		
	}

}
