package com.Amokartproject.producttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;

@Listeners(com.Amokartproject.generic.listenerutility.Listeners.class)
public class product_commonTest extends BaseClass {
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("addProduct--common PRD Successfully", true);
	}
	
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("updateProduct --common PRD Successfully", true);
	}
	
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --common PRD Successfully", true);
	}
}
