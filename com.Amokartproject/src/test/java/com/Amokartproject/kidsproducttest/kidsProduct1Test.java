package com.Amokartproject.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;

@Listeners(com.Amokartproject.generic.listenerutility.Listeners.class)
public class kidsProduct1Test extends BaseClass{
	@Test(priority = 1,groups="FT") //,invocationCount = 2
	public void addProduct()
	{
		Reporter.log("addProduct--kids PRD 1 Successfully", true);
	}
	
	//@Test(priority = 2,dependsOnMethods = "addProduct",groups="functionality")
	@Test(priority = 2,dependsOnMethods = "addProduct",groups="IT")
	public void updateProduct()
	{
		Reporter.log("updateProduct --kids PRD 1 Successfully", true);
	}
	
	@Test(priority = 3,dependsOnMethods = "addProduct",groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --kids PRD 1 Successfully", true);
	}

}
