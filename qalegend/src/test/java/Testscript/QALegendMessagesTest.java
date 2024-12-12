package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendMessagesTest extends Base {
	public WebDriver driver;
	@Test
	public void messageReply() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnMessagesTitle();
		messagepage.clickOnComposeMessage();
		messagepage.clickOnToRecipient();
		messagepage.selectValueMessageToDropDown(properties.getProperty("messagepage_to_name"));
		//messagepage.clickOnDropDownTextBox();
		String subject=properties.getProperty("subject")+FakerUtility.randomNumberGenerator();
		messagepage.clickOnSubjectTextbox(subject);
		messagepage.clickOnMessageTextBox();
		messagepage.clickOnSentButton();
		Thread.sleep(3000);
		messagepage.clickOnSentItems();
		Assert.assertEquals(messagepage.getnewlyAddedSubject(), subject);
		
		
		
		
		/*messagepage.clickOnAMessage();
		String message=properties.getProperty("message")+FakerUtility.randomNumberGenerator();
		messagepage.clickOnMessageTextBoxArea(message);
		messagepage.clickOnReplyButton();
		messagepage.ClickOnSentItems();*/
		
	}
	

}
