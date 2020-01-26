package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class AmbulatoryCarePage extends Base {
	public AmbulatoryCarePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='OutpatientIcon Registration']")WebElement iconRegistration;
	@FindBy(linkText="Registration")WebElement linkRegistration;
	
	public void clickOnIconNewRegistration() {
		iconRegistration.click();
	}
	public void clickOnNewRegistration() {
		linkRegistration.click();
	}

}
