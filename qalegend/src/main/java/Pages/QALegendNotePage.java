package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendNotePage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath ="//a[@class='btn btn-default']")
	WebElement addnotebutton;
	@FindBy(id="title")
	WebElement titlefield;
	@FindBy(id="description")
	WebElement descriptionfield;
	@FindBy(id="s2id_autogen3")
	WebElement labelfield;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement notepagesavebutton;
	@FindBy(xpath="//div[@id='note-table_filter']//descendant::input")
	WebElement notepageseacrh;
	@FindBy(xpath="(//a[@class='edit'])[1]")
	WebElement newlyaddedtitle;

	
	
	
	
	
	
	
	
	public QALegendNotePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}	


public void clickAddNoteButton() {
		addnotebutton.click();
	}
	public void addNote(String title,String description) {
	pageutilities.enterTextOnWebelement(titlefield, title);	
	pageutilities.enterTextOnWebelement(descriptionfield, description);	
	pageutilities.ClickOnElement(labelfield);
	pageutilities.enterKeyPress();
	pageutilities.ClickOnElement(notepagesavebutton);
	
	}
	public void searchNote(String notetitle) throws InterruptedException {
		Thread.sleep(2000);
		notepageseacrh.sendKeys(notetitle);	
		
	}
	
public String getNewlyAddedTitle() {
	String title=newlyaddedtitle.getText();
	return title;
	
	
}
}
