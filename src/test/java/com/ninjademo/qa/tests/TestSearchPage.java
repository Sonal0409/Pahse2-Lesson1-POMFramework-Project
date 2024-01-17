package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ninjademo.qa.base.TestBase;
import com.ninjademo.qa.pages.SearchPage;

public class TestSearchPage extends TestBase {

	
	SearchPage sp;
	
	@BeforeMethod
	public void OpenApp()
	{
	openBrowser();
	sp = new SearchPage(driver);
		
	}
	
	@Parameters({"product"})
	@Test(testName="productentry", priority='1')
	public void test_searchProduct(String product)
	{
		sp.SearchProduct(product);
	}
	
}
