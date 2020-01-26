package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InpatientPage {
	public InpatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='InpatientIcon Admission']")WebElement iconAdmission;

	
	public void clickOnAdmission() {
		iconAdmission.click();
	}
}
