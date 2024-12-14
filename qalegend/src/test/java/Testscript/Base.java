package Testscript;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import Pages.QALegendClientsPage;
import Pages.QALegendEstimatePage;
import Pages.QALegendFinancePage;
import Pages.QALegendHomePage;
import Pages.QALegendInvoicePage;
import Pages.QALegendItemPage;
import Pages.QALegendNotePage;
import Pages.QALegendProjectPage;
import Pages.QALegendTicketsPage;
import Pages.qaLegentLoginPage;
import Utilities.ScreenShotUtility;
import constants.Constants;

public class Base {
	public WebDriver driver;
	public Properties properties;
	public FileInputStream fis;
	qaLegentLoginPage loginpage;
	QALegendHomePage homepage;
	QALegendNotePage notepage;
	QALegendInvoicePage invoicePage;
	QALegendItemPage itempage;
	QALegendClientsPage clientpage;
	QALegendEstimatePage estimatepage;

	QALegendTicketsPage ticketspage;
	QALegendProjectPage projectpage;
	QALegendFinancePage financepage;

	


	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void browserinitialisation(String browserName) throws Exception {
		properties = new Properties();
		fis = new FileInputStream(Constants.CONFIGFILE);
        properties.load(fis);
		if (browserName.equalsIgnoreCase("Chrome"))//different browser invoking
		{
		driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
	
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			
			driver=new EdgeDriver();
		}
		
		else 
		{
			
			throw new Exception("Invalid name exception");
		}
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage = new qaLegentLoginPage(driver);
		homepage=new QALegendHomePage(driver);
		notepage = new QALegendNotePage(driver);
		invoicePage = new QALegendInvoicePage(driver);	
		itempage = new QALegendItemPage(driver);
		clientpage=new QALegendClientsPage(driver);
		estimatepage=new QALegendEstimatePage(driver);
		ticketspage=new QALegendTicketsPage(driver);
		projectpage=new QALegendProjectPage(driver);
	financepage=new QALegendFinancePage(driver);

		
		
	}
	@AfterMethod(alwaysRun = true)
	public void AfterMethod(ITestResult itResult) throws IOException {
		if(itResult.getStatus()==ITestResult.FAILURE) {
			ScreenShotUtility sc = new ScreenShotUtility();
			sc.captureFailedScreenShots(driver, itResult.getName());
		}
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
	
/*public String getScreesnShotPath(String testcasename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile= System.getProperty("user.dir")+"\\test-output\\"+testcasename+".png";
		Files.copy(source, new File(destinationfile));
		return destinationfile;
	}*/


}
