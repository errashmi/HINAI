package com.rex.hinai_auto.pageUI;

import javax.annotation.Detainted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class InvoiceBillingPage extends Base {
	public InvoiceBillingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="invoiceFormId:patientMrNoId")WebElement txtPatMrNo;
	@FindBy(id="invoiceFormId:patientSearchId")WebElement btnSearch;
	@FindBy(xpath="//span[text()='Add Service/Package']")WebElement btnAddServices;
	
	@FindBy(id="addServicesForm:departmentId")WebElement ddDept;
	@FindBy(id="addServicesForm:consultantNameId")WebElement txtCons;
	@FindBy(xpath="//table[@id='addServicesForm:doctorNameuggestionBox:suggest']/tbody/tr/td[2]")WebElement tblCons;
	
	@FindBy(id="addServicesForm:service")WebElement txtService;
	@FindBy(xpath="//table[@id='addServicesForm:suggestionBox:suggest']/tbody/tr/td[3]")WebElement tblService;
	
	@FindBy(id="addServicesForm:addServicesId")WebElement btnAddService;
	@FindBy(id="addServicesForm:j_id2313")WebElement btnclose;
	
	@FindBy(id="invoiceFormId:save")WebElement btnSave;
	public void addNewService() throws Exception {
		txtPatMrNo.sendKeys("3000000476229");
		//Thread.sleep(5000);
		btnSearch.click();
		Thread.sleep(5000);
		btnAddServices.click();
		Thread.sleep(5000);
		selectOption(ddDept, 1);
		Thread.sleep(3000);
		txtCons.sendKeys("%%");
		Thread.sleep(3000);
		tblCons.click();
		Thread.sleep(3000);
		txtService.sendKeys("t3");
		Thread.sleep(3000);
		tblService.click();
		Thread.sleep(3000);
		btnAddService.click();
		Thread.sleep(3000);
		btnclose.click();
		Thread.sleep(3000);
		btnSave.click();
		
	}
	

}
