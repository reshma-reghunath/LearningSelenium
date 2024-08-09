package com.Amokartproject.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsProductTest1 {
	@Test(priority = 1,invocationCount = 2,groups="integration")
	public void addProduct()
	{
		Reporter.log("addProduct--kids PRD Successfully", true);
	}
	
	@Test(priority = 2,dependsOnMethods = "addProduct",groups="functionality")
	public void updateProduct()
	{
		Reporter.log("updateProduct --kids PRD Successfully", true);
	}
	
	@Test(priority = 3,dependsOnMethods = "addProduct",groups="smoke")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --kids PRD Successfully", true);
	}

}
