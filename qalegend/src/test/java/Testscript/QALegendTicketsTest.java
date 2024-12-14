package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendTicketsTest extends Base {
	public WebDriver driver;
	@Test
	public void deleteTicket() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnTicketsTitle();
		ticketspage.clickOnAddTicket();
		Thread.sleep(2000);
	String titleticket=properties.getProperty("titleticket")+FakerUtility.randomNumberGenerator();;
		ticketspage.enterTitle(titleticket);
		Thread.sleep(3000);
		ticketspage.enterTextonDescription();
		ticketspage.clicOnSaveButton();
		Thread.sleep(1000);
		ticketspage.clicOnSearchBox(titleticket);
		Thread.sleep(1000);
		Assert.assertEquals(ticketspage.getNewlyAddedTitleTicket(), titleticket);

	}

}
