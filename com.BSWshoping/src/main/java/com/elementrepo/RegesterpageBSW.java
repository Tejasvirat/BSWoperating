package com.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegesterpageBSW extends basepageBSW
{

	public RegesterpageBSW(WebDriver driver) {
		super(driver);
	}
	
   @FindBy(id = "FirstName")
   private WebElement Firstnametextbox;
   
   @FindBy(id = "LastName")
   private WebElement Lastnametextbox;
   
   @FindBy(id = "Email")
   private WebElement Emailtextbox;
   
   @FindBy(id = "Password")
   private WebElement Passwordtextbox;
   
   @FindBy(id = "ConfirmPassword")
   private WebElement ConfirmPasswordtextbox;

public WebElement getFirstnametextbox() {
	return Firstnametextbox;
}

public WebElement getLastnametextbox() {
	return Lastnametextbox;
}

public WebElement getEmailtextbox() {
	return Emailtextbox;
}

public WebElement getPasswordtextbox() {
	return Passwordtextbox;
}

public WebElement getConfirmPasswordtextbox() {
	return ConfirmPasswordtextbox;
}
   
   
   

}
