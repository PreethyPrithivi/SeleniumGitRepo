package com.selenium.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.qa.driver.DriversetUp;
import com.selenium.qa.pages.Loginpage;



/**
 * Unit test for simple App.
 */
public class tc01case extends DriversetUp
{
	Loginpage testpg;
@BeforeClass
	public void initialisepagefactory(){
		driver = getdriver();
		testpg = PageFactory.initElements(driver, Loginpage.class);
		
	}
	
	
	@Test
	public void tc01(){
		testpg.clickSignin();
		testpg.enteremail();
	}
	
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
}