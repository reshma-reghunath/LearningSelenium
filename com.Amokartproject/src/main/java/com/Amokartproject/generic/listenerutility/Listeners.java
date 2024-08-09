package com.Amokartproject.generic.listenerutility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Amokartproject.generic.common.BaseClass;

public class Listeners extends BaseClass implements ITestListener
{

	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name=result.getName();
		
		Reporter.log("Taking Screenshot-- Start---"+name,true);
		
		//perform TypeCasting-WebDriver Type to TakeScreensgot
		//TakesScreenshot tsref=(TakesScreenshot) driver;
		TakesScreenshot tsref=(TakesScreenshot) BaseClass.driver_Static;
		
		//call the screenshot method and save in Temp path
		File temp=tsref.getScreenshotAs(OutputType.FILE);
		//Create a permanent path ans save it
		File permanent=new File("./src/test/resources/Screnshot/"+name+".png");
		
		//copy the file from Temp to Permenant
		try {
		   FileHandler.copy(temp, permanent);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Reporter.log("Taking Screenshot-- Completed---"+name,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
	

