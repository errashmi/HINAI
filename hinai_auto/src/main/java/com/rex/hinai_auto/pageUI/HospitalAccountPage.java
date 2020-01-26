package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class HospitalAccountPage extends Base {
	public HospitalAccountPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='HospitalAccIcon Invoice']")WebElement iconInvoice;
	public void clickOnInvoice() {
		iconInvoice.click();
	}

}
