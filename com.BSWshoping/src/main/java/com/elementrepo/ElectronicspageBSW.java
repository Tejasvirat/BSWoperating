package com.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericclass.baseclassBSW;

public class ElectronicspageBSW extends baseclassBSW
{
	public  ElectronicspageBSW(WebDriver driver) 
	{
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(partialLinkText = "Camera, photo")
	public WebElement cameralink;
	
	@FindBy(partialLinkText = "Cell phones")
	public WebElement cellphoneslink;

	
	
	@FindBy(partialLinkText = "Smartphone")
	public WebElement product1;
	
	@FindBy(partialLinkText = "Used phone")
	public WebElement product2;
	
	@FindBy(partialLinkText = "Phone Cover")
	public WebElement product3;

	public WebElement getCameralink() {
		return cameralink;
	}

	public WebElement getCellphoneslink() {
		return cellphoneslink;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getProduct3() {
		return product3;
	}

	
	

}
