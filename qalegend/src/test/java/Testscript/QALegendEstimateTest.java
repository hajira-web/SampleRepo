package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QALegendEstimateTest extends Base {
	public WebDriver driver;
	@Test
	public void editEstimate() {
	loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
	homepage.clickOnEstimateTitle();
	homepage.clickOnEstimateListTitle();
	homepage.clickOnEstimateRequest();
	
	


	
	}
}
