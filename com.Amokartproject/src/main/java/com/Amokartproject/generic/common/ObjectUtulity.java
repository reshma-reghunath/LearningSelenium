package com.Amokartproject.generic.common;

import org.openqa.selenium.WebDriver;

import com.Amokartproject.generic.excelutility.ReadExcelFile;
import com.Amokartproject.generic.javautility.JavaUtility;
import com.Amokartproject.generic.propertyfileutility.ReadPropertyFile;
import com.Amokartproject.generic.webdriverutility.WebdriverUtility;

public class ObjectUtulity implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public	JavaUtility javaobj;
	public	ReadPropertyFile propertyobj;
	public	WebdriverUtility webdriverobj;
	//public WebDriver driver;

	public void objectCreation() {
		excelobj = new ReadExcelFile();
		javaobj = new JavaUtility();
		propertyobj = new ReadPropertyFile();
		webdriverobj = new WebdriverUtility();

	}

}
