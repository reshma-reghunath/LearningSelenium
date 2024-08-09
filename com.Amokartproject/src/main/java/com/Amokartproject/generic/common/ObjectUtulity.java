package com.Amokartproject.generic.common;

import com.Amokartproject.generic.excelutility.ReadExcelFile;
import com.Amokartproject.generic.javautility.JavaUtility;
import com.Amokartproject.generic.propertyfileutility.ReadPropertyFile;
import com.Amokartproject.generic.webdriverutility.WebDriverUtility;

public class ObjectUtulity implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public	JavaUtility javaobj;
	public	ReadPropertyFile propertyobj;
	public	WebDriverUtility webdriverobj;

	public void objectCreation() {
		excelobj = new ReadExcelFile();
		javaobj = new JavaUtility();
		propertyobj = new ReadPropertyFile();
		webdriverobj = new WebDriverUtility();

	}

}
