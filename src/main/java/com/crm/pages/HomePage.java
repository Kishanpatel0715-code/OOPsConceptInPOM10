package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	//page locators
	private By logo = By.xpath("//a[@id='nav-logo-sprites']");
	
	private By HomeLink = By.linkText("Home");

	public WebElement getLogo() {
		return getElement(logo);
	}

	public WebElement HomeLink() {
		return getElement(HomeLink);
	}

	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public boolean getHomePageLogo() {
		return getLogo().isDisplayed();
	}
	
	public boolean HomeLinkPresent() {
		return HomeLink().isDisplayed();
	}
}
