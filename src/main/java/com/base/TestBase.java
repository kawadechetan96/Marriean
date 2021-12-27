package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties pro;
	public static Logger logger;
	
	
				public TestBase()
				{
					try{
					File source=new File("E:\\Selenium Programs\\Marriean\\src\\main\\java\\com\\config\\Configuration.property");
					FileInputStream fis=new FileInputStream(source);
					
					pro=new Properties();
					pro.load(fis);
					}catch(Exception e){}
				}
				
				public static void inti()
				{
					String browser1=pro.getProperty("browser");
					
					if(browser1.equals("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver_win32\\chromedriver.exe");
						driver=new ChromeDriver();
					}
					
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get(pro.getProperty("url"));
					logger=Logger.getLogger(TestBase.class);
					logger.info("**************************URL Launched*********************");
					System.out.println("Master");
					
				}

}
