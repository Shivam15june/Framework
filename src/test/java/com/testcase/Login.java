package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.pages.Baseclass;

import com.pages.Loginpage;

public class Login extends Baseclass {

	@Test
	public void Loginapp() {

		logger = report.createTest("Login to SauceDemo");

	

		logger.info("Starting  Application");
		// it will go to the login page it will check all the locators it will
		// initialize and it will return all the object
		Loginpage loginPage = PageFactory.initElements(driver, Loginpage.class);

		loginPage.logintoSaucedemo("standard_user", "secret_sauce");
		logger.pass("Login Done Successfully");
	}

}
