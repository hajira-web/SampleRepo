package Testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	@Test
	public void addNote() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnDashBoardNotesButton();
		notepage.clickAddNoteButton();
		String title=properties.getProperty("title")+FakerUtility.randomNumberGenerator();
		notepage.addNote(title, properties.getProperty("description"));
		notepage.searchNote(title);
		Assert.assertEquals(notepage.getNewlyAddedTitle(), title);
		}

}
