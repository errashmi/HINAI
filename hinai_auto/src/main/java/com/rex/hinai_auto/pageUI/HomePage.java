package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class HomePage extends Base {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Apps")WebElement linkApps;
	@FindBy(linkText="Logout")WebElement linkLogout;
	
	public void clickOnApps() {
		linkApps.click();
		
	}
	public void logout() {
		linkLogout.click();
	}

}
