package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QALegendLeaveTest extends Base {
	public WebDriver driver;
	@Test
	public void leaveapprove() {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnLeaveTitle();
		leavepage.clickeditbutton();
		leavepage.clickapprovebutton();
		}
	
}
