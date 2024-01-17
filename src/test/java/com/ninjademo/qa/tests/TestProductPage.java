package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ninjademo.qa.base.TestBase;
import com.ninjademo.qa.pages.HomePage;
import com.ninjademo.qa.pages.SearchPage;

public class TestProductPage extends TestBase {
	

SearchPage sp;
HomePage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
	openBrowser();
	sp = new SearchPage(driver);
	hp = new HomePage(driver);	
	}
	
	//@Parameters({"product"})
	@Test(testName="addtoCartproduct", priority='1')
	public void addproducttoCartTest() throws InterruptedException
	{
		sp.SearchProduct("mac");
		Thread.sleep(1000);
		sp.selectProduct();
		Thread.sleep(1000);
		sp.productaddtocart();
		Thread.sleep(1000);
		hp.Clickonshoppingcart();
	}
	
	
	
	
	
	
	
	
	
	
	

}
