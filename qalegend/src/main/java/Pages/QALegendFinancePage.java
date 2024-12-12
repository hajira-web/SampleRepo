package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendFinancePage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//a[@class='btn btn-default mb0']")
	WebElement addexpenses;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement amounttextbox;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement titletextbox_addexpenses;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebutton_addexpenses;
	@FindBy(xpath="//div[@class='modal in']")
	WebElement beforescrollrandomclick_addexpenses;
	
	@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
	WebElement searchbox_expenses;
	@FindBy(xpath="//a[@class='edit']")
	WebElement editbutton_expenses;
	
	@FindBy(xpath="(//td[@class=' text-right'])[1]")
	WebElement newlyaddedamount_addexpenses;
	
	
	
	
		public QALegendFinancePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
			this.pageutilities=new PageUtilities(driver);
			PageFactory.initElements(driver, this);
	}
		
		public void clickOnAddExpenses() {
			addexpenses.click();
		}
		public void enterAmount(String amountexpenses) {
			pageutilities.enterTextOnWebelement(amounttextbox, amountexpenses);
			
		}
		
		public void enterTitleOnAddExpense(String titleaddexpense) {
			pageutilities.enterTextOnWebelement(titletextbox_addexpenses, titleaddexpense);
		}
		
		
		
		public void clickOnSaveButtonAddExpenses() throws InterruptedException {
			Thread.sleep(1000);
		beforescrollrandomclick_addexpenses.click();
		Thread.sleep(1000);
			pageutilities.scrollPage();
			Thread.sleep(1000);
			pageutilities.clickUsingJavaScript(savebutton_addexpenses);
		}
		
		public void searchNewlyAddedTitle(String titleaddexpense) throws InterruptedException {
			Thread.sleep(2000);
			searchbox_expenses.sendKeys(titleaddexpense);
			Thread.sleep(2000);
		}
	
		
		public String getNewlyAddedamount_expenses() {
			String amountexpenses=newlyaddedamount_addexpenses.getText();
					return amountexpenses;
		}
	

}
