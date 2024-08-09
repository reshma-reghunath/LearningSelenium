package com.Amokartproject.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsProductTest9 {
	@Test(invocationCount =  2,groups="integration")
	public void addProduct()
	{
		Reporter.log("addProduct--kids PRD Successfully", true);
	}
	
	@Test(invocationCount =  2,groups="functionality")
	public void updateProduct()
	{
		Reporter.log("updateProduct --kids PRD Successfully", true);
	}
	
	@Test(invocationCount =  2,groups="smoke")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --kids PRD Successfully", true);
	}

}
