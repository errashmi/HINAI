package com.rex.hinai_auto.pageUI;

import javax.annotation.Detainted;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rex.hinai_auto.basepage.Base;

public class AdmissionFormPage extends Base {
	public AdmissionFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="patientAdmissionForm:patientMrNoId")WebElement txtPatMrnNo;
	@FindBy(id="patientAdmissionForm:patientSearchId")WebElement btnPatSearch;
	@FindBy(id="patientAdmissionForm:department11")WebElement ddDept;
	@FindBy(id="patientAdmissionForm:selDoctor1")WebElement ddCons;
	@FindBy(id="patientAdmissionForm:wardId1")WebElement ddWard;
	@FindBy(id="patientAdmissionForm:selAdmissionType")WebElement ddAdmType;
	@FindBy(id="patientAdmissionForm:BedSearch")WebElement imgSearchBed;
	
	@FindBy(xpath="//table[@class='rich-table panelGridRow bedDataGrid']") WebElement tblBedData;
	@FindBy(id="BedBlockingAdmissionId:BlockEmergencyBedId")WebElement btnBedBlock;
	
	@FindBy(id="patientAdmissionForm:save")WebElement btnSave;
	
	public void fillPatAdmDetails() throws Exception {
		txtPatMrnNo.click();
		txtPatMrnNo.sendKeys("3000000476147");
		Actions act=new Actions(driver);
		act.sendKeys(txtPatMrnNo, Keys.ENTER).build().perform();
		Thread.sleep(10000);
		selectOption(ddDept,5);
		Thread.sleep(5000);
		selectOption(ddCons, 2);
		Thread.sleep(3000);
		selectOption(ddWard, 13);
		Thread.sleep(3000);
		selectOption(ddAdmType, 7);
		Thread.sleep(3000);
		imgSearchBed.click();
		Thread.sleep(3000);
		tblBedData.click();
		Thread.sleep(3000);
		btnBedBlock.click();
		Thread.sleep(3000);
		btnSave.click();
		
	}

}
