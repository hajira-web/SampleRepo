package Utilities;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	public WebDriver driver;
	public PageUtilities(WebDriver driver) {
		this.driver=driver;

		// TODO Auto-generated constructor stub
	}
	public void ClickOnElement(WebElement element){
	element.click();	
	}
	 public void enterTextOnWebelement(WebElement element,String text){
		 element.sendKeys(text);
		 }
	 public void selectByVisibleText(WebElement dropdown, String visbletext) {
		 Select drp = new Select(dropdown);
		 drp.selectByVisibleText(visbletext);
	 }
	 public void selectByValue(WebElement dropdown, String value ) {
		 Select drp = new Select(dropdown);
		 drp.selectByValue(value);
		  }
	 public void selectByIndex(WebElement dropdown, int value) {
		 Select drp = new Select(dropdown);
		 drp.selectByIndex(value);
	}
	 public void dragAndDrop(WebElement source,WebElement destination) {
		 Actions action = new Actions(driver);
		 action.dragAndDrop(source, destination).build().perform();
		  }
	 public void hoverOverElement(WebElement element) {
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		  }
	 public void rightClick() {
		 Actions action = new Actions(driver);
		 action.contextClick().build().perform();
	 }
	 public void rightClickOnElement(WebElement element) {
		 Actions action = new Actions(driver);
		 action.contextClick(element).build().perform();
	 }
	 public void scrollPage() {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
		  }
	 public boolean isElementVisible(WebElement element) {
		 return(element.isDisplayed());
	 }
	 public void enterKeyPress() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		}
	public void ctrlKeyEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).build().perform();
		}
	public void  doubleClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.doubleClick(element).build().perform();
		}
	public void cLickOnCheckBox(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
		}
	public boolean isElementEnabled(WebElement element) {
		return(element.isEnabled());
		}
	public void clickUsingJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	
	
public void alertHandling(WebElement element,String alert) {
	Actions action = new Actions(driver);
	
	
	
	
}

	 

}
