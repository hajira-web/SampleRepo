package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendEstimateTest extends Base {
	public WebDriver driver;
	@Test
	public void addEstimateForm() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnEstimateTitle();
		homepage.clickOnEstimateFormTitle();
		estimatepage.clickOnAddFormButtonEstimateForm();
		String titleaddform=properties.getProperty("titleaddform")+FakerUtility.randomNumberGenerator();
		estimatepage.enterTextOnAddFormTitle(titleaddform);
		estimatepage.clickOnSaveButtonAddForm();
			Assert.assertEquals(estimatepage.getNewlyAddedTitleAddFormPage(), titleaddform);
	}
}
