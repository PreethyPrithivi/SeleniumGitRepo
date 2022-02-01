package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
 
	@FindBy(how=How.XPATH,using="//a[text()='My Account']")
	WebElement MyAccount;
	
	@FindBy(how=How.XPATH,using = "//input[@id='reg_email']")
	WebElement EmailID;
	
	public void clickSignin(){
		MyAccount.click();
	}
	public void enteremail(){
		EmailID.sendKeys("ptt@abc.com");
	}
}
