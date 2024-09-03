package com.Amokartproject.generic.webdriverutility;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Amokartproject.generic.common.FrameworkConstant;
import com.Amokartproject.generic.javautility.JavaUtility;



/**
 * This class contains reusable methods to perform driver related actions
 * @author Reshma
 * 
 * **/
public class WebdriverUtility implements FrameworkConstant {
	
	public static WebDriver driver_Static = null;
	public WebDriver driver;
	Actions action;
	Select select;
	
	/**
	 * This method launches specific browser
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			
			driver=new ChromeDriver();
			driver_Static=driver;
			break;
			
		case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver_Static=driver;
			break;
			
		case "edge":
			//WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver_Static=driver;
			break;
			
		default:
			System.out.println("invalid browser info");
		}
		return driver;
	}
	
	
	/**
	 * This method is used to navigate to the application
	 * 
	 * @param url
	 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method is used to navigate to the application
	 * @param url
	 */
	public void navigateToApp(String url)
	{
		driver.get(url);
	}
	
	
/**
 * This method waits until element is found
 * @param time
 */
	
	public void waitUntilElementFound()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitduration));
	}
	
	
	/**
	 * 
	 * This method waits until element is visible on the web page
	 * @param time
	 * @param element
	 * @return
	 */
	public void explicitWait(long time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	/**
	 * This method is used to mouse hover on an element
	 * @param element
	 */
	public void mouseHoverToElement(WebElement element)
	{
		action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	/**
	 * This method is used to double click on an element
	 * @param element
	 */
	public void doubleClickOnElement(WebElement element)
	{
		action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	

	/**
	 * This method is used to right click on an element
	 * @param element
	 */
	public void rightClick(WebElement element)
	{
		action=new Actions(driver);
		action.contextClick(element).perform();
	}
	
	
	/**
	 * This method is used to right click on an target
	 * @param element
	 * @param target
	 */
	public void dragAndDropElement(WebElement element,WebElement target)
	{
		action=new Actions(driver);
		action.dragAndDrop(element, target).perform();
	}
	
	
	/**
	 * This method is used to select an  element from drop down based on index
	 * @param element
	 * @param index
	 */
	public void selectFromDropdown(WebElement element,int index)
	{
		select=new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is used to select an  element from drop down based on value
	 * @param element
	 * @param value
	 */
	public void selectFromDropdown(WebElement element,String value)
	{
		select=new Select(element);
		select.selectByValue(value);
	}
	
	
	/**
	 * This method is used to select an element from drop down based on visible text
	 * @param text
	 * @param element
	 */
	public void selectFromDropdown(String text,WebElement element)
	{
		select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	
	
	//SWITCH TO FRAME
	/**
	 * This method is used to swtich to frame based on index
	 * @param index
	 */
		public void switchToFrame(int index) 
	    {
			driver.switchTo().frame(index);
		}
		
		/**
		 * This method is used to swtich to frame based on id or name attribute value
		 * @param idOrName
		 */
		public void switchToFrame(String idOrName) 
	    {
			driver.switchTo().frame(idOrName);
		}
		
		/**This method is used to swtich to frame based on frame Element
		 * 
		 * @param driver
		 * @param element
		 */
		public void switchToFrame(WebElement element) 
	    {
			driver.switchTo().frame(element);
		}
		
		
		/**
		 * This method is used to swtich back to default window
		 * 
		 */
		public void switchToDefaultWindow() 
	    {
			driver.switchTo().defaultContent();
		}
		
		
   /**
	 * This method is used to scroll till the specified element on the web page
	 * 
	 * @param element
	 */
		public void scrollToElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		
		
		/**
		 * This method handles alert pop up
		 * 
		 * @param status
		 */
		public void handleAlert(String status) {
			Alert al = driver.switchTo().alert();
			if (status.equalsIgnoreCase("ok"))
				al.accept();
			else
				al.dismiss();
		}

		
		
	
		/**
		 * This method is used to close current tab or window
		 */
		public void closeWindow() {
			driver.close();
		}
		
		
		/**
		 * This method is used to close all the opened tabs or windows
		 */
		public void quitAllWindows() {
			driver.quit();
		}

		
		/**
		 * This method converts dynamic xpath to WebElement
		 * 
		 * @param commonPath
		 * @param replaceData
		 * @return
		 */
		public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData) {
			String requiredPath = String.format(commonPath, replaceData);
			return driver.findElement(By.xpath(requiredPath));
		}
		
		
		
		
		
		
		//SWITCH TO ALERT HANDLING
		public void switchToAlertAndAccept(WebDriver driver) 
	    {
			driver.switchTo().alert().accept();
		}
		public void switchToAlertAndCancel(WebDriver driver) 
	    {
			driver.switchTo().alert().dismiss();;
		}
		
		//Select class handle the dropdowns
		public void select(WebElement element,String text) 
	    {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		public void select(WebElement element,int index) 
	    {
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
		
		
		//Actions class to handle the mouse &keyboard actions
		public void mousemoveonElement(WebDriver driver,WebElement element)
		{
			Actions act= new Actions(driver);
			act.moveToElement(element).perform();
		}
		public void doubleclick(WebDriver driver,WebElement element)
		{
			Actions act= new Actions(driver);
			act.doubleClick(element).perform();
		}
	public void clickOnElement()
	{
		
	}
	public void passDataOnElement()
	{
		
	}
	public void clearDataOnElement()
	{
		
	}
	public void validateOnElementDisplayed()
	{
		
	}
	public void validateOnElementEnable()
	{
		
	}
	public void validateOnElementSelected()
	{
		
	}
	public void selectOptionDropdown(int index)
	{
		
	}
	public void selectOptionDropdown(String visibletext)
	{
		
	}
	public void selectOptionDropdown_Value(String value)
	{
		
	}
	public void switchControlToAlert()
	{
		
	}
	public void switchControlToFrame()
	{
		
	}
	
	
	
}


