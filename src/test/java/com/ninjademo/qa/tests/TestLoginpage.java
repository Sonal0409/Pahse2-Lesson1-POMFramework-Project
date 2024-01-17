package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ninjademo.qa.base.TestBase;
import com.ninjademo.qa.pages.HomePage;
import com.ninjademo.qa.pages.LoginPage;

public class TestLoginpage extends TestBase{
	
HomePage hp;
LoginPage lp;
	
	@BeforeMethod
	public void openApp()
	{
		openBrowser();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}
	
	@Parameters({"emailid","password"})
	@Test(testName="login-valid", priority='1')
	public void test_login(String emailid, String password) throws InterruptedException
	{
		hp.ClickonMyAccount();
		hp.ClickonLogin();
		hp.gettitle();
		lp.loginappValidCredentials(emailid, password);
		Thread.sleep(1500);	
		extentTest.pass("Test Passed");
		
	}
	
	
	

}


















