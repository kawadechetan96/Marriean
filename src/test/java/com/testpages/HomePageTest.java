package com.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.WorldofDayPage;

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
	
	/*@Test(priority=1)
	public void verift_logintest()
	{
		homepage.verify_login();
	}*/
	
	@Test(priority=2)
	public void verify_world_of_day_link_test(){
		homepage.verify_sumary_link();
		/*homepage.verify_world_of_day_link();
		String title=driver.getTitle();
		System.out.println(title);
		logger.info("***********************class called***********************");*/
		//Assert.assertEquals(title, "Word of the Day: Beleaguer | Merriam-Webster");
	}		
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
