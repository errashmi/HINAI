package com.rex.hinai_auto.homepage;

import org.testng.annotations.Test;

import com.rex.hinai_auto.basepage.Base;
import com.rex.hinai_auto.pageUI.AppsPage;
import com.rex.hinai_auto.pageUI.HomePage;
import com.rex.hinai_auto.pageUI.HospitalAccountPage;
import com.rex.hinai_auto.pageUI.InvoiceBillingPage;
import com.rex.hinai_auto.pageUI.InvoiceListPage;
import com.rex.hinai_auto.pageUI.LoginPage;

import org.testng.annotations.BeforeTest;

public class TC002_NewInvoice extends Base {
  @Test
  public void verifyNewInvoice() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
	  HomePage hp=new HomePage(driver);
	  hp.clickOnApps();
	  AppsPage ap=new AppsPage(driver);
	  ap.clickOnHospitalAccount();
	  HospitalAccountPage hap=new HospitalAccountPage(driver);
	  hap.clickOnInvoice();
	  InvoiceListPage ilp=new InvoiceListPage(driver);
	  ilp.clickNewInvoice();
	  InvoiceBillingPage ibp=new InvoiceBillingPage(driver);
	  ibp.addNewService();
	  
	  hp.logout();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  browserlaunch("chrome", "http://demo.icthealth.com/brltest");
  }

}
