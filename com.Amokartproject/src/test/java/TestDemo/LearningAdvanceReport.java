package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
	
	public static void main(String[] args) {
		
		//Create the SparkReport
	ExtentSparkReporter spark	=new ExtentSparkReporter("./AdvanceReports/report.html");
	
	
	//configure the Spark Report information
	spark.config().setDocumentTitle("Regression Testing for the RegisterPge");
	
	spark.config().setReportName("RegressionSuite");
	
	spark.config().setTheme(Theme.DARK);
	
	
	//create the Extent Report
      ExtentReports report=	new ExtentReports();
      
    
      //Attach the spark Report and Extent Report
      report.attachReporter(spark);
      
      //Configure the system information in Extent Report by Attaching
      
       report.setSystemInfo("Device Name", "Reshma");
      
      report.setSystemInfo("Operating System", "WINDOWS 10");
      
     report.setSystemInfo("Browser :", "chrome");
     
     report.setSystemInfo("Browser Version", "chrome-127.0.6533.120");
      
      
     //create the test information
     ExtentTest test = report.createTest("RegressionTest");
     
     //Steps Information
     test.log(Status.INFO, "Step 1: Launching the Browser Successful");
     
     test.log(Status.INFO, "Step 2: Navigating via url successful");
      
     test.log(Status.PASS, "Step 3: Verified the WebPage successful");
      
     
     
     if(true==true)
     {
    	 test.log(Status.PASS, "Step 4: Verified the WebElement displayed");
    
     }
     else
     {
    	 test.log(Status.FAIL, "Step 4: verified the WebElement is not  Displayed");
    //	 test.addScreenCaptureFromBase64String(null, "Screenshot Taken--Element Not Displayed");
     }
     
     
     test.log(Status.SKIP, "Step 5: Element is hidden");
     
     //flush the report Information
     report.flush(); 
     
     System.out.println("execution done");
	}

}
