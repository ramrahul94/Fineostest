package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class Logintest extends BaseTest {        //used Inheritance here inheriting from base class 
	
	@Test
	public void testvalidlogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterpassword("admin");
		loginPage.clickLogin();
		System.out.println("Title of the page is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
		
		
		
		
		
			
		
		
	}

}
		
			
		
		
	