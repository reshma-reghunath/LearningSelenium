package com.Amokartproject.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class product_commonTest {
	@Test
	public void addProduct()
	{
		Reporter.log("addProduct--common PRD Successfully", true);
	}
	
	@Test
	public void updateProduct()
	{
		Reporter.log("updateProduct --common PRD Successfully", true);
	}
	
	@Test
	public void deleteProduct()
	{
		Reporter.log("deleteProduct --common PRD Successfully", true);
	}
}
