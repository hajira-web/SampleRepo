package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendMessagesTest extends Base {
	public WebDriver driver;
	@Test
	public void messageReply() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnMessagesTitle();
		messagepage.clickOnAMessage();
		String message=properties.getProperty("message")+FakerUtility.randomNumberGenerator();
		messagepage.clickOnMessageTextBoxArea(message);
		messagepage.clickOnReplyButton();
		
	}
	

}
