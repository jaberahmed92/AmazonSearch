package com.amazonStepDef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazonPages.PageObjectModel;
import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef extends Base {
	String expectedprice;
	String actualprice;
	PageObjectModel page;
	
	@Given("user navigate to the amazon home page")
	public void user_navigate_to_the_amazon_home_page() {
		launchBrowser();
		page = PageFactory.initElements(driver, PageObjectModel.class);
		
	    
	   
	}
	@When("^user enter the item name on \"([^\"]*)\" button$")
	public void user_enter_the_item_name_on_button(String arg1) throws Throwable {
	   page.searchbtn(arg1);
	}

	@When("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    
	    page.clicksearch();
	}

	@When("^click on the item$")
	public void click_on_the_item() throws Throwable {
	    
	    page.getFirstLink();
	   expectedprice=page.checkprice.getText();
	   System.out.println(expectedprice);
	  
	}

	@When("^click on add cart$")
	public void click_on_add_cart() throws Throwable {
		page.addcart();
		expectedprice = page.checkprice.getText();
		actualprice = page.PriceValidateAfteraddcart.getText();
		System.out.println(actualprice);
		Assert.assertEquals(actualprice, expectedprice);
		    
		  
	   
	}

	@When("^click on proceed to checkout$")
	public void click_on_proceed_to_checkout() throws Throwable {
		page.checkingout();
	   
	}

	@Then("^checkout should be successful$")
	public void checkout_should_be_successful() throws Throwable {


	}




}
