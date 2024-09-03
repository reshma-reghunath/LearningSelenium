package com.Amokartproject.makeupproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;

@Listeners(com.Amokartproject.generic.listenerutility.Listeners.class)

public class makeupProductTest  extends BaseClass{
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("addProduct--foundation PRD Successfully", true);
	}
	
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("updateProduct --lipstick PRD Successfully", true);
	}
	
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --eyelinner PRD Successfully", true);
	}
}
