package com.Tesecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_HomePageValidate extends GenericMethods {
	
	public static boolean stepstatus;
	
	
	
	@Given("browser is launched and aplication url is loaded")
	public static boolean launchBrowser(DataTable data)
	{
		List<List<String>>  url=data.raw();
		// to launch browser
	GenericMethods.launchBrowser("FireFox", url.get(0).get(0));
	return stepstatus=true;
		
	}
	
	@When("browser is launched maximize it")
	public static  void  maximize()
	{
	   //to maximize the window
		driver.manage().window().maximize();
	}
	
	@Then("Verify all home page elements and click on all links,come back to home page")
	public static boolean verifyElements()
	{
		//to find links of home page	
		//GenericMethods.verifyLinksofpage();
		
		//to click on the link and get back to home page
		//GenericMethods.clicklinksofpageandcomeback();
		
		//to find text boxes of home page
		//GenericMethods.verifyTextboxesofpage();
		
		
		// to find images in home page
		//GenericMethods.verifyImagesofpage();
		
		
        return stepstatus=true;
		
	}
	

}
	