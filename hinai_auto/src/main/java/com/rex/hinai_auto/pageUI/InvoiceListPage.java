package com.rex.hinai_auto.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class InvoiceListPage extends Base {
	public InvoiceListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='round_button']/span/img")WebElement imgNew;
	@FindBy(id="patientInvoicesListPage:j_id362")WebElement btnNewInvoice;

	public void clickNewInvoice() {
	imgNew.click();
	btnNewInvoice.click();
}
}
