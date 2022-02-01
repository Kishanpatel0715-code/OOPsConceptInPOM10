package com.crm.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class HomePageTest extends BaseTest{

	HomePage homePage;
	@Test(priority=1)
	public void verifyHomePageLogoTest() {
		homePage = page.getInstance(LoginPage.class).doLogin(prop.getProperty("email"), prop.getProperty("password"));
		Boolean flag = homePage.getInstance(HomePage.class).getHomePageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void HomeLinkPresentTest() {
		homePage = page.getInstance(LoginPage.class).doLogin(prop.getProperty("email"), prop.getProperty("password"));
		Boolean flag2 = homePage.getInstance(HomePage.class).HomeLinkPresent();
		Assert.assertTrue(flag2);
	}
}
