package com.Amokartproject.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;

public class kidsProduct3Test extends BaseClass {
	//@Test(invocationCount =  2,groups="FT")
	
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("addProduct--kids PRD 3 Successfully", true);
	}
	
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("updateProduct --kids PRD 3 Successfully", true);
	}
	
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --kids PRD 3 Successfully", true);
	}

}
