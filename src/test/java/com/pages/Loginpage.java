package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	@FindBy(id = "user-name")
	WebElement uname;

	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(id = "login-button")
	WebElement button;

	public void logintoSaucedemo(String username, String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(username);
		pswd.sendKeys(password);
		button.click();

	}

}
