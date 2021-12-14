package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[text()='LOG IN']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='WORD OF THE DAY']")
	WebElement worldofday;
	
																	public HomePage()
																	{
																		PageFactory.initElements(driver, this);
																	}
																	
																	public LoginPage verify_login()
																	{
																		login.click();
																		return new LoginPage();
																	}
																	
																	public WorldofDayPage verify_world_of_day_link(){
																		worldofday.click();
																		return new WorldofDayPage();
																	}		
	
	
	
	

}
