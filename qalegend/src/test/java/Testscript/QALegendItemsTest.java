package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class QALegendItemsTest extends Base {
	public WebDriver driver;
	@Test
	public void deleteItem() {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnItemsTitle();
		itempage.clickOnDeleteButton();

		
	}

}
