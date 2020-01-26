package com.rex.hinai_auto.homepage;

import org.testng.annotations.Test;

import com.rex.hinai_auto.basepage.Base;
import com.rex.hinai_auto.pageUI.AdmissionFormPage;
import com.rex.hinai_auto.pageUI.AppsPage;
import com.rex.hinai_auto.pageUI.HomePage;
import com.rex.hinai_auto.pageUI.InpatientPage;
import com.rex.hinai_auto.pageUI.LoginPage;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;

public class TC003_Admission extends Base {
  @Test
  public void patAdmission() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
	  HomePage hp=new HomePage(driver);
	  hp.clickOnApps();
	  AppsPage ap=new AppsPage(driver);
	  ap.clickOnInpatient();
	  InpatientPage ip=new InpatientPage(driver);
	  ip.clickOnAdmission();
	  AdmissionFormPage afp=new AdmissionFormPage(driver);
	  afp.fillPatAdmDetails();
  }
  @BeforeClass
  public void beforeClass() {
	  browserlaunch("chrome", "http://demo.icthealth.com/brltest");
  }

}
