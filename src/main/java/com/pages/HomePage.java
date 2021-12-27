package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[text()='LOG IN']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='WORD OF THE DAY']")
	WebElement worldofday;
	
//	@FindBy(xpath="//a[text()='smarmy']")
	//WebElement  smarmy;
	
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
	
																public void  verify_sumary_link()
																	{
																	 WebDriverWait  wait=new WebDriverWait(driver,20);
																	 wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[text()='smarmy']"))));
																	 driver.findElement(By.xpath("//a[text()='smarmy']")).click();
																	}
																
	

}
