package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[text()='LOG IN']")
	WebElement login;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage verify_login()
	{
		login.click();
		return new LoginPage();
	}
	
	
	
	

}
