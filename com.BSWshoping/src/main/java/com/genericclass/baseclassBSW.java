package com.genericclass;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.elementrepo.basepageBSW;
import com.elementrepo.loginpageBSW;

public class baseclassBSW
{
public static WebDriver driver;
public static ExtentSparkReporter spark;
public static LocalDateTime ldt=LocalDateTime.now();
public static String date=ldt.toString().replace(":", "-");
public static    ExtentReports extent;
public static propertiesclassBSW prop;
public static basepageBSW basepageBSW;
public static loginpageBSW login;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before suite",true);
		Reporter.log("configuring reports");
	    spark = new ExtentSparkReporter("./extentreportsBSW/"+date+".html");
	     extent = new ExtentReports();
	     extent.attachReporter(spark);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite",true);
		Reporter.log("flush the report");
		extent.flush();
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test",true);
	}
	
	@Parameters("bname")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browserName) {
		Reporter.log("Before Class",true);
		Reporter.log("Launch browser, maximize and load Url");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		 prop = new propertiesclassBSW();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.featchproperty("url"));
		 basepageBSW = new basepageBSW(driver);
		
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("After Class",true);
		Reporter.log("Close the browser and end the session");
		driver.close();
		driver.quit();
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Before method",true);
		Reporter.log("Login");
		basepageBSW.getLOginlink().click();
		login=new loginpageBSW(driver);
		login.getEmailTextBox().sendKeys(prop.featchproperty("email"));
		login.getPasswordTextBox().sendKeys(prop.featchproperty("password"));
		login.getLoginButton().click();
		
		
		
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After method",true);
		Reporter.log("logout");
		basepageBSW.getLogutbutton().click();
	}

}
