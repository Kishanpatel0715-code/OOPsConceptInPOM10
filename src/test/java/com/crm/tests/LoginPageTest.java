package com.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	public LoginPageTest() {
		super();
	}
	
	@Test(priority=1)
	public void getLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon Sign In");
	}
	
	@Test(priority=2)
	public void doLoginTest() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin(prop.getProperty("email"), prop.getProperty("password"));
		String homePageTitle = homePage.getInstance(HomePage.class).getHomePageTitle();
		System.out.println(homePageTitle);
	}
}
