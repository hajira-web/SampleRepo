package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendItemsTest extends Base {
	public WebDriver driver;
	@Test
	
public void deleteItem() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnItemsTitle();
		itempage.clickOnAddItemsButton();
		String titleadditem1=properties.getProperty("titleadditem1")+FakerUtility.randomNumberGenerator();
		itempage.enterTextOnTitleTextBox(titleadditem1);
		itempage.enterRateOnRateTextBox();
		itempage.clickOnSaveButtonAddItem();
		itempage.enterNewlyAddedTitleOnSearchBox(titleadditem1);
		itempage.clickOnDeleteButton();
		Assert.assertNotEquals(itempage.getDeletedTitle(), titleadditem1);

	}
	
	@Test
	public void additem() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnItemsTitle();
		itempage.clickOnAddItemsButton();
		String titleadditem=properties.getProperty("titleadditem")+FakerUtility.randomNumberGenerator();
		itempage.enterTextOnTitleTextBox(titleadditem);
		itempage.enterRateOnRateTextBox();
		itempage.clickOnSaveButtonAddItem();
		itempage.enterNewlyAddedTitleOnSearchBox(titleadditem);
		Assert.assertEquals(itempage.getNewlyAddedTitle(), titleadditem);
	}

}
