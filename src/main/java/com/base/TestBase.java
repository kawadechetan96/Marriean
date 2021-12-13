package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties pro;
	
	
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
					
					driver.get(pro.getProperty("url"));
					
				}

}