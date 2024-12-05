package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEstimatePage {

public WebDriver driver;
	public PageUtilities pageutilities;
	
	
	
	
public QALegendEstimatePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

}
