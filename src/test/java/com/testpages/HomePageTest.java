package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class HomePageTest extends TestBase {
	
	
	HomePage homepage;
    public HomePageTest()
    {
    	super();
    }
	@BeforeMethod
	public void launch()
	{
		inti();
		homepage=new HomePage();
	
	}
	
	@Test(priority=1)
	public void verift_logintest()
	{
		homepage.verify_login();
	}
	

}
