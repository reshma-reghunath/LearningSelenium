package com.Amokartproject.registertest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;
import com.Amokartproject.generic.common.BaseClassOriginal;
import com.Amokartproject.generic.excelutility.ReadExcelFile;
import com.Amokartproject.generic.pagerepository.RegisterPage;

public class RegisterOriginalTest extends BaseClassOriginal {
	
	@Test(enabled = false)
	public void createUser_validData() {
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	// Verify page using Assert
	String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);

		// Step 1: enter the name in the text field
	//WebElement name=driver.findElement(By.id("name"));
		///name.clear();
     	//name.sendKeys("Reshma");

	// create object for Register page
		RegisterPage regpage = new RegisterPage(driver);

		// step1 : clear the name in the Name textField
		regpage.getNameTextField().clear();

		// create an object for Excel utility file class
		ReadExcelFile excel_F = new ReadExcelFile();

		// step2 : write the name into name Field
		regpage.getNameTextField().sendKeys(excel_F.readdata("Sheet1", 1, 1));

		// Step 3: Display the mail
		System.out.println(excel_F.readdata("Sheet1", 1, 2));

		// Step 4:Write the data
		excel_F.writedata("Sheet1", 10, 1, "Reshma");
		
		
		Reporter.log("CreateUser_ValidData for Register Test ", true);

		// Reporter.log("createUser_validData for registerTest", true);
	}

	
	// public void createUser_invalidData(String[][] data) {
//	@Test(dataProvider = "Register")
//	public void createUser_invalidData(String name, String email, String pswd) {
//
//		String name = data[0][0];
//		String id = data[0][1];
//		String dept = data[0][2];

	@Test(dataProvider = "Register")
	public void createUser_invalidData(String name, String email, String pswd)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step1 :Identify name TextField

	driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);

		// Step2: Identify email text field
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys(email);

		// Step3 :Identify password text field

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pswd);

		String name1 = name;
		String email1 = email;
		String pswd1 = pswd;

		System.out.println("Name:" + name1);
		System.out.println("Email:" + email1);
		System.out.println("Passwordt:" + pswd1);

		Reporter.log("createUser_invalidData for registerTest", true);
	}


}
