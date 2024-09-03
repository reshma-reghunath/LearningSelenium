package com.Amokartproject.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amokartproject.generic.common.BaseClass;

public class loginTest extends BaseClass{
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
