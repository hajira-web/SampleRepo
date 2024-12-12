package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendEstimateTest extends Base {
	public WebDriver driver;
	@Test
	public void editEstimate() throws InterruptedException {
	loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
	homepage.clickOnEstimateTitle();
	homepage.clickOnEstimateListTitle();
	homepage.clickOnEstimateRequest();
	estimatepage.clickOnCreateEstimateRequest();
	Thread.sleep(1000);
	estimatepage.clickOnSelectAFormFromPopUpPage();
	Thread.sleep(1000);
	//estimatepage.clickOnAddClientTextbox();
	estimatepage.clickOnDropdownTextBoxAddClient();
	}
	@Test
	public void addEstimateForm() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnEstimateTitle();
		homepage.clickOnEstimateFormTitle();
		estimatepage.clickOnAddFormButtonEstimateForm();
		Thread.sleep(1000);
		String titleaddform=properties.getProperty("titleaddform")+FakerUtility.randomNumberGenerator();
		Thread.sleep(1000);
		estimatepage.enterTextOnAddFormTitle(titleaddform);
		estimatepage.clickOnSaveButtonAddForm();
		Thread.sleep(1000);
		Assert.assertEquals(estimatepage.getNewlyAddedTitleAddFormPage(), titleaddform);
	}
}
