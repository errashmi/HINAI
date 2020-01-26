package com.rex.hinai_auto.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	//METHOD FOR BROWSER LAUNCH
	public static WebDriver driver;
	public void browserlaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
//method to getdata from property file
	public static final String path="./config.properties";
	public String getdata(String key) throws Exception {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	//methos to select option from dropdown
	public void selectOption(WebElement element, int index) {
		new Select(element).selectByIndex(index);
		
	}
}
