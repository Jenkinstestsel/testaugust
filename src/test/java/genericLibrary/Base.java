package genericLibrary;

import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	public WebDriver driver;
	public static ExtentReports extentReports;
	public ExtentTest startTest;
	@BeforeSuite
	public void intitalSetup(){
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		String reportdate = simpleDateFormat.format(date);
		
		extentReports = new ExtentReports("E:\\Report\\" + "rediffAutomationreport_" + reportdate + ".html"    ,false);
		
		
	}
	
	
	
	
	@BeforeMethod
	public void launch_App() throws Exception{
		driver = new FirefoxDriver();
		driver.get(utility.getpropertyval("url"));
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void teardown(){
		
		driver.close();
		extentReports.endTest(startTest);
		extentReports.flush();
		
	}	
	
	

}
