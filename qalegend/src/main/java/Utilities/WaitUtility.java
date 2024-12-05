package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;//allertobe

public class WaitUtility {
public WebDriver driver;
public void waitForClickingElement(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void waitForTextToBePresentInTheElement(WebDriver driver,WebElement element,String text) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));
}
public void waitForElementTobeSelected(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.elementToBeSelected(element));
}
public void waitForAttributeToBe(WebDriver driver,WebElement element,String attribute,String value) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
}
public void waitForVisibilityOfAnElement(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForAlertIsPresent(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.alertIsPresent());
}


}
