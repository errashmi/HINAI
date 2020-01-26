package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class LoginPage extends Base {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login-username")WebElement txtUsername;
	@FindBy(id="login-password")WebElement txtPassword;
	@FindBy(className="base-button")WebElement btnLogin;
	
	public void login() throws Exception {
		//txtUsername.sendKeys("khl2529");   //Hardcoded data
		//txtPassword.sendKeys("1234");		//to get data from properties file we have extend the base page and use getdata method
		txtUsername.sendKeys(getdata("uid"));
		txtPassword.sendKeys(getdata("pwd"));
		btnLogin.click();
	}
}
