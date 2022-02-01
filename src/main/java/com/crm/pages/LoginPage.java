package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By email = By.name("email");
	private By firstClick = By.id("continue");
	private By password = By.name("password");
	private By loginBtn = By.id("signInSubmit");
	
	public WebElement getEmail() {
		return getElement(email);
	}
	
	public WebElement getFirstClick() {
		return getElement(firstClick);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public HomePage doLogin(String un,String pwd) {
		getEmail().sendKeys(un);
		getFirstClick().click();
		getPassword().sendKeys(pwd);
		getLoginBtn().click();
		
		return getInstance(HomePage.class);
		
	}
	
	public void doLogin() {
		getEmail().sendKeys("");
		getFirstClick().click();
		getPassword().sendKeys("");
		getLoginBtn().click();
	}
}
