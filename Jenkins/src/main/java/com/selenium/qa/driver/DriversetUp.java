package com.selenium.qa.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



/**
 * Hello world!
 *
 */
public class DriversetUp
{
	public static WebDriver driver;
	public static String baseUrl = "http://practice.automationtesting.in/";
   public WebDriver getdriver(){
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prame\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
  ChromeOptions options = new ChromeOptions();
  options.addArguments("window-size=1400,800");
  options.addArguments("headless");
   driver=new ChromeDriver(options);
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get(baseUrl);
   return driver;
   } 
   
}
