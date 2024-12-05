package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QALegendTicketsTest extends Base {
	public WebDriver driver;
	@Test
	public void deleteTicket() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnTicketsTitle();
		ticketspage.cliclOnSettingButton();
		ticketspage.clickOnDeleteButton();
		ticketspage.clickOnDeleteSureButton();
	}

}
