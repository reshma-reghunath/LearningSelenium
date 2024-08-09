package com.Amokartproject.makeupproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class makeupProductTest {
	@Test
	public void addProduct()
	{
		Reporter.log("addProduct--foundation PRD Successfully", true);
	}
	
	@Test
	public void updateProduct()
	{
		Reporter.log("updateProduct --lipstick PRD Successfully", true);
	}
	
	@Test
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --eyelinner PRD Successfully", true);
	}
}
