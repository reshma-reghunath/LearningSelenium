package com.Amokartproject.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class loginTest {
	@Test
	public void login_validData()
	{
		Reporter.log("login_validData Successfully", true);
	}
	
	@Test
	public void login_invalidData()
	{
		Reporter.log("login_invalidData Successfully", true);
	}

}
