package com.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericclass.baseclassBSW;

public class computerpageBSW extends baseclassBSW
{
	public computerpageBSW(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(partialLinkText = "Desktops")
	public WebElement destoplink;
	
	@FindBy(partialLinkText = "Notebooks")
	public WebElement notebookslink;

	@FindBy(partialLinkText = "Accessories")
	public WebElement Accessorieslink;
	
	
	@FindBy(partialLinkText = "Build your own cheap computer")
	public WebElement product1;
	
	@FindBy(partialLinkText = "Build your own computer")
	public WebElement product2;
	
	@FindBy(partialLinkText = "Build your own expensive computer")
	public WebElement product3;

	public WebElement getDestoplink() {
		return destoplink;
	}

	public WebElement getNotebookslink() {
		return notebookslink;
	}

	public WebElement getAccessorieslink() {
		return Accessorieslink;
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
