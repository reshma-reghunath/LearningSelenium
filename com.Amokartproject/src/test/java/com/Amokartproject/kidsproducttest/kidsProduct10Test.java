package com.Amokartproject.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;


public class kidsProduct10Test extends BaseClass {
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("addProduct--kids PRD 10 Successfully", true);
	}
	
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("updateProduct --kids PRD 10  Successfully", true);
	}
	
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --kids PRD 10  Successfully", true);
	}

}
