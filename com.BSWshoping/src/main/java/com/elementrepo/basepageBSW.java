package com.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericclass.baseclassBSW;

public class basepageBSW extends baseclassBSW
{
	public basepageBSW(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	
	@FindBy(partialLinkText ="Log in")
	private WebElement LOginlink;
	
	@FindBy(partialLinkText ="Shopping cart")
	private WebElement Shoppingcartlink;
	
	@FindBy(partialLinkText ="Wishlist")
	private WebElement Wishlistlink;
	
	@FindBy(partialLinkText ="Electronics")
	private WebElement Electronicslink;
	
	@FindBy(partialLinkText ="Computers")
	private WebElement Computerslink;
	
	@FindBy(partialLinkText ="Books")
	private WebElement bookslink;

	@FindBy(partialLinkText = "Log out")
	private WebElement logutbutton;
	
	public WebElement getLogutbutton() {
		return logutbutton;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLOginlink() {
		return LOginlink;
	}

	public WebElement getShoppingcartlink() {
		return Shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return Wishlistlink;
	}

	public WebElement getElectronicslink() {
		return Electronicslink;
	}

	public WebElement getComputerslink() {
		return Computerslink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	
}
