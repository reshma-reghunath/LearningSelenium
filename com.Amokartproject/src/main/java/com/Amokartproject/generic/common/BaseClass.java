package com.Amokartproject.generic.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass extends ObjectUtulity 
{
	public  WebDriver driver=null;
	public static WebDriver driver_Static;
	

	@DataProvider(name = "Register")
	public Object[][] Registerdata() {

		Object[][] data = new Object[3][3];

		data[0][0] = "Durga";
		data[0][1] = "durga@gmail.com";
		data[0][2] = "Testing";

		data[1][0] = "Reshma";
		data[1][1] = "reshma@gmail.com";
		data[1][2] = "Devloper";

		data[2][0] = "Sathish";
		data[2][1] = "satheesh@gmail.com";
		data[2][2] = "Devops";

		return data;
	}

	@BeforeMethod
	public void Login() {
		Reporter.log("Login Successful", true);

	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Successful", true);
	}

	@Parameters("browser")
	@BeforeClass
public void browserSetUp(String browser) {
// bname="chrome";
		// if user gives browsername="chrome"
		if (browser.equals("chrome")) {
			// Step1: launch the browser
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}

		// if user gives browsername="firefox"
		else if (browser.equals("firefox")) {
			// Step1: launch the browser-firefox
			driver = new FirefoxDriver();
		}

		// if user gives browsername="edge"
		else if (browser.equals("edge")) {
			// Step1: launch the browser
			driver = new EdgeDriver();
		}

		else {
			System.out.println("u have entered invalid browser name");
			driver = new ChromeDriver();
		}

		// create object for all
		objectCreation();

		// Fetch data
		String url1 = propertyobj.readdata("url");

//		propertyobj.displaydata("url");
//		propertyobj.writeData("email", "test@gmail.com");

		// Step2: Navigate to the application using URL
		driver.get(url1);
		Reporter.log("BrowserSetup Successful", true);
	}

	@AfterClass
	public void closebrowser() {
		// Close the Browser
		driver.close();
		Reporter.log("CloseBrowser Successful", true);
	}

	@BeforeTest
	public void precondition() {
		Reporter.log("Pre Condition Successful", true);

	}

	@AfterTest
	public void postcondition() {
		Reporter.log("Post condition done Successful", true);
	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("get SuiteConnections done Successful", true);
	}

	@AfterSuite
	public void terminateSuiteConnections() {
		Reporter.log("terminate SuiteConnections done Successful", true);
	}
}
