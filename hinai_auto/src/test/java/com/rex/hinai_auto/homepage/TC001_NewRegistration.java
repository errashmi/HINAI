package com.rex.hinai_auto.homepage;

import org.testng.annotations.Test;

import com.rex.hinai_auto.basepage.Base;
import com.rex.hinai_auto.pageUI.AmbulatoryCarePage;
import com.rex.hinai_auto.pageUI.AppsPage;
import com.rex.hinai_auto.pageUI.HomePage;
import com.rex.hinai_auto.pageUI.LoginPage;
import com.rex.hinai_auto.pageUI.NewRegistrationPage;

import org.testng.annotations.BeforeTest;

public class TC001_NewRegistration extends Base {
  @Test
  public void verifyLogin() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
	  HomePage hp=new HomePage(driver);
	  hp.clickOnApps();
	  AppsPage ap=new AppsPage(driver);
	  ap.clickOnAmbulatorycare();
	  AmbulatoryCarePage acp=new AmbulatoryCarePage(driver);
	  acp.clickOnIconNewRegistration();
	  acp.clickOnNewRegistration();
	  NewRegistrationPage nrp=new NewRegistrationPage(driver);
	  nrp.fillPatientDetails();
	  nrp.fillpatientAddrDetails();
	  nrp.fillEncounterDetails();
	  nrp.clickButtonRegistration();
	  Thread.sleep(10000);
	  hp.logout();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  //browserlaunch("chrome","http://demo.icthealth.com/brltest"); //hard coded browser and url
	  browserlaunch(getdata("browser"), getdata("url")); 			 //getting data from property file
  }


}
