package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendFinanceTest extends Base {
	public WebDriver driver;
	@Test
	
	public void addExpensesFinance() throws InterruptedException {
		loginpage.loginToQaLegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnFinanceTitle();
		homepage.clickOnExpensesFinanceSubTitle();
		financepage.clickOnAddExpenses();
		String amountexpenses=properties.getProperty("amountexpenses")+FakerUtility.randomNumberGenerator();
		financepage.enterAmount(amountexpenses);
		String titleaddexpense=properties.getProperty("titleaddexpense")+FakerUtility.randomNumberGenerator();
		financepage.enterTitleOnAddExpense(titleaddexpense);
		financepage.clickOnSaveButtonAddExpenses();
		Thread.sleep(2000);
		financepage.searchNewlyAddedTitle(titleaddexpense);
		Thread.sleep(2000);
		Assert.assertEquals(financepage.getNewlyAddedamount_expenses(), amountexpenses);
		
		
		
		
	}

}
