package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class AppsPage extends Base {
	public AppsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='icon registration']")WebElement IconAmbulatoryCare;
	@FindBy(xpath="//a[@class='icon billing']")WebElement IconHospitlAccount;
	@FindBy(xpath="//a[@class='icon adt']")WebElement IconInpatient;
	
	public void clickOnAmbulatorycare() {
		IconAmbulatoryCare.click();
	}
	public void clickOnHospitalAccount() {
		IconHospitlAccount.click();
	}
	public void clickOnInpatient() {
		IconInpatient.click();
	}
}
