package com.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	WebDriver driver;
	public PageObjectModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbtn;
	public void searchbtn(String searchitem) {
		searchbtn.sendKeys(searchitem);
	}
	@FindBy(id="nav-search-submit-button")
	WebElement clicksearch;
	public void clicksearch() {
		clicksearch.submit();
	}
	@FindBy(xpath="(//a[@class='a-link-normal a-text-normal'])[1]")
	WebElement firstLink;
	public void getFirstLink() {
		firstLink.click();
	}
	@FindBy(xpath="//span[@class='a-size-medium a-color-price header-price a-text-normal']")
	public WebElement checkprice;
	public void getcheckprice() {
		
	}
	
	
	@FindBy(id="add-to-cart-button")
	WebElement addcart;
	public void addcart() {
		addcart.click();
	}
	
	@FindBy(xpath="(//span[@class='a-color-price hlb-price a-inline-block a-text-bold'])[1]")
	public WebElement PriceValidateAfteraddcart;
	public void getPriceValidateAfteraddcart() {
		
	}
	@FindBy(id="hlb-ptc-btn-native")
	WebElement checkingout;
	public void checkingout() {
		checkingout.click();
	}
	}
	
	
	
	


