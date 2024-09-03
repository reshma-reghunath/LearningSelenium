package com.Amokartproject.electronicproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;


@Listeners(com.Amokartproject.generic.listenerutility.Listeners.class)
public class electronicProductTest extends BaseClass {
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("added Product--electronic Successfully", true);
	}
	
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("updated Product --electronic Successfully", true);
	}
	
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("deleted Product --electronic Successfully", true);
	}

}
