package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendProjectTest extends Base {
	
	public WebDriver driver;
	@Test
	public void addNewproject() throws InterruptedException 
	{
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnProjectTitle();
		homepage.clickOnAllProjects();
		projectpage.clickOnAddProjectButton();
		String titleproject = properties.getProperty("titleproject")+FakerUtility.randomNumberGenerator();
		projectpage.enterTextOnTitleTextBox(titleproject);
		projectpage.clickOnSaveButton();
		projectpage.clickOnSearchButton(titleproject);
		Assert.assertEquals(projectpage.getNewlyAddedTitleProject(), titleproject);
		}
	}
