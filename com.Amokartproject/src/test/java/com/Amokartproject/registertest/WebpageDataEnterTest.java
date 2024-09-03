package com.Amokartproject.registertest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;
import com.Amokartproject.generic.pagerepository.RegisterPage;
import com.Amokartproject.generic.webdriverutility.WebdriverUtility;

public class WebpageDataEnterTest extends BaseClass{
	
	@Test
	public void registerValidData()
	{
		
	String name=excelobj.readdata("Sheet1", 1, 1);
	String email=excelobj.readdata("Sheet1", 1, 2);
	String password=excelobj.readdata("Sheet1", 1, 3);
	String mobno=excelobj.readdata("Sheet1", 1, 4);
	String feedback=excelobj.readdata("Sheet1", 1, 6);
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//provide implicitly wait
		webdriverobj.waitUntilElementFound();
		
		String exptitle="LearningSelenium";
		
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
		
		//Create an object for Register Page
		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
		
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getNameTextField().isDisplayed();
		
		//Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
	    	
		//Step 3: Perform Actions --clear
		regpage.getNameTextField().clear();
		
		//Step 4: Perform Actions --Enter Name
		regpage.getNameTextField().sendKeys(name);;
		
		//Step 5: Perform Actions --Enter Email
		regpage.getEmailTextField().sendKeys(email);
				
		
		//Step 6: Perform Actions --Enter Password
		regpage.getPwdTextField().sendKeys(password);
		
		//Step 7: Perform Actions --Enter Mobile number
		regpage.getMobTextField().sendKeys(mobno);
		
		//Step 8: Perform Actions --Enter Feedback
				regpage.getFeedbackTextfield().sendKeys(feedback);
						

//		// Step 1: Verify Register page using Assert
//		    String exp_title = "LEarning WEB TECHNOLOGY FORMS";
//			String act_title = driver.getTitle();
//			System.out.println(act_title);
//			Assert.assertEquals(act_title, exp_title);
//
//		//Step 2:Verify the element
//			//Step 1:validate name label
//			 String exp_nameLabel="Name:";
//			 String act_nameLabel=driver.findElement(By.xpath("//label[text()='Name:']")).toString();
//			 Assert.assertEquals(exp_nameLabel,act_nameLabel);
//			
//			// Step 2: enter the name in the text field
//		    WebElement name1=driver.findElement(By.id("name"));
//			name1.clear();
//	     	name1.sendKeys("Reshma");
//	     	
//	     	//Step 3 :validate email label
//			 String exp_emailLabel="Email:";
//			 String act_emailLabel=driver.findElement(By.id("email")).toString();
//			 Assert.assertEquals(exp_emailLabel,act_emailLabel);
//	     	
//	     	//Step 4: Enter email in the text field
//			
//	 	     // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("reshma@gmail.com");
//	 	    driver.findElement(By.xpath("//form[@target='_blank']/fieldset/table/tbody/tr[2]/td[2]/input[@name='email']")).sendKeys("reshma@gmail.com");
//	 		
//	 	    //Step 5  :validate password label
//			 String exp_passwordLabel="Password:";
//			 String act_passwordLabel=driver.findElement(By.xpath("//label[text()='Password:']")).toString();
//			 Assert.assertEquals(exp_passwordLabel,act_passwordLabel);
//	 	    
//	 	    // Step 6:Enter password in the text field
//	 		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("durga");
//	 		
//	 		//Step 7: Enter mobile number in the text field
//	 	    driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile No ']")).sendKeys("1234567899");
//	 	    
//	 	  //Step 8: Enter DOB in the text field
//	 	    driver.findElement(By.xpath("//input[@type='datetime-local']")).sendKeys("01/01/2000");
//	 	    
//	     	
	  
	}

}
