package com.Tesecases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericMethods.GenericMethods;

import comApplication_Pages.HomePage;
import comApplication_Pages.Register;
//===========================================Tc01_ValidateRegisterLink==================
public class Tc01_ValidateRegisterLink extends HomePage{
	
//===================================================================================	
    /*MetodName:validateRegisterLink
     * Purpose:To validateRegisterLink
     * Input Parameters:
     * Return Type:void
     * Dependency:
     * Date of Creation:23-November-2018
     * Created By:Revathi
     * Reviewed By:
     * Modified Date:	
     */ 
//==============================validateRegisterLink=======================	
@Test
public static void validateRegisterLink() throws InterruptedException
{boolean status;

//Step 1:Launch Browser and enter the URL
launchBrowser("FireFox","https://www.talentzing.com/");
status=true;


//Step 2:Load homepage elements and methods
	HomePage homepage=PageFactory.initElements(driver, HomePage.class);
	
//Step 3:Load Register page elements and methods	
	Register register=PageFactory.initElements(driver, Register.class);
	
//Step 4:Click 	on Register link
	homepage.clickRegister();
	
//Step 5:Verify Learning  Child is present or not	
	register.Validate_Learning();
	
//Step 6:Click on Trainee link	
	register.clickTrainee();
	
	
	
	
}

}
