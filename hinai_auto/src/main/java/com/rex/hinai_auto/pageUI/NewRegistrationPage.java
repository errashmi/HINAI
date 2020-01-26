package com.rex.hinai_auto.pageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rex.hinai_auto.basepage.Base;

public class NewRegistrationPage extends Base {
	public NewRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="navigation:patPrefix")WebElement ddPatPrefix;
	@FindBy(id="navigation:firstName")WebElement txtFirstName;
	@FindBy(id="navigation:genderCombo")WebElement ddGender;
	@FindBy(id="navigation:age")WebElement txtAge;
	@FindBy(id="navigation:patMobileNo")WebElement txtMobileNo;
	
	@FindBy(id="navigation:singAddrhouseAddress")WebElement txtHouseNo;
	@FindBy(id="navigation:singAddrstreet")WebElement txtStreet;
	@FindBy(id="navigation:ploiceStationId")WebElement txtPoliceStation;
	@FindBy(id="navigation:singAddrlocality")WebElement txtLocality;
	@FindBy(id="navigation:singDistrictCodeId")WebElement txtDistrict;
	
	@FindBy(id="navigation:appDepartmentId")WebElement ddDept;
	@FindBy(id="navigation:appConsultantId")WebElement ddConsultant;
	
	@FindBy(id="navigation:register_REGTYPES001Btn")WebElement btnRegistration;
	
	public void fillPatientDetails() throws Exception {
		selectOption(ddPatPrefix,2);
		txtFirstName.sendKeys("Amitt");
		Thread.sleep(3000);
		selectOption(ddGender, 2);
		txtAge.sendKeys("23");
		txtMobileNo.sendKeys("1231231234");
	}
	public void fillpatientAddrDetails() {
		txtHouseNo.sendKeys("xxxxxx");
		txtStreet.sendKeys("yyyy");
		txtPoliceStation.sendKeys("ppppp");
		txtLocality.sendKeys("lllll");
		txtDistrict.sendKeys("KHORDHA");
	}
	
	public void fillEncounterDetails() throws Exception {
		selectOption(ddDept, 1);
		Thread.sleep(15000);
		selectOption(ddConsultant,5);
		//new Select(ddConsultant).selectByValue("2768");
	}

	
	public void clickButtonRegistration() throws Exception {
		Thread.sleep(4000);
		btnRegistration.click();
		
	}
	
	

}
