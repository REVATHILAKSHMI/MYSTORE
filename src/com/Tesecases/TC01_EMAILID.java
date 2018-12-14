package com.Tesecases;


import java.util.List;

import com.GenericMethods.GenericMethods;

import comApplication_Pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_EMAILID extends HomePage{
	
	
public static boolean Stepstatus=true;
    
	@Given("Browser is launched and application url is loaded") 
	    public static boolean launch(DataTable data)
	    {
		List<List<String>>  url=data.raw();
	        // to launch browser
	        GenericMethods.launchBrowser("FireFox", url.get(0).get(0));
	    
	    //to maximize window
	    driver.manage().window().maximize();
	    return Stepstatus=true;
	        
	    }
	  

	@When("Verify 'Sign-in link' is available in 'My Store' page If Sig-in exist click on Sigin")
	public static void Sigin()
	{
	    System.out.println("To Verify  Sig-in link is present in My store");
	    
	    
	try{
		String s=Lnk_Sigin.getText().trim();
	

	    System.out.println(s);
	    System.out.println("Sig-in is present in My store");
	    if(s.equalsIgnoreCase("Sign in"))
	    {
	    	GenericMethods.overClick(Lnk_Sigin);
	        System.out.println("Sin-in is Clicked");
	    }
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	    
	}

	@Then("In 'sign page'  Verify  'Create- Account header' is available or not")
	public static void createAcc()
	{
	    
	try{
	    String ema1= CreAcc_Header.getText().trim();
	    System.out.println(ema1);
	    if(ema1.equalsIgnoreCase("CREATE AN ACCOUNT"))
	    {
	        System.out.println("In 'sign page'   'Create- Account header' is available");
	    }
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	    
	}

	@And("Verify 'Email address' is preasent under Create Account if present enter a valid Email-id if mailid exist should display error messege")
	public static void aeEid(DataTable email)
	{
	    
	    //verify Email address text
	    
	   try{ 
		   String ema2=Emailadd_Header.getText();
	   
	    System.out.println(ema2);
	    if(ema2.equalsIgnoreCase("Email address"))
	    {
	        System.out.println("Email address' is preasent under Create Account");
	    }
	   }catch(Exception e)
	    {
	    	  System.out.println(e.getMessage());
	    }
	    //Sending Data to Email address text box
	   try{ List<List<String>>  emid=email.raw();
	    
	    Emailiput_txt.sendKeys(emid.get(0).get(0));
	    
	    GenericMethods. overClick(Createacc_btn);  
	    
	   System.out.println("Email id  entered incorrect");
	   
	    System.out.println( Eror_Msg.getText());
	    
	   }catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	}

	@Then("If Email-id entered is  valid and does not exist then create a new account by Clicking on Create Account  Button")
	public static void e(DataTable email )
	{
	    //If Email-id entered is  valid and does not exist then create a new account
	   try{
		   
		   List<List<String>>  emid=email.raw();
	    Emailiput_txt.clear();
	    Emailiput_txt.sendKeys(emid.get(0).get(0));
	    System.out.println("Email id entered");
	    GenericMethods. overClick(Createacc_btn);
	    System.out.println("Create an account button is clicked");
	   }catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	}

	@Then("Verify Create an Account Page has all fields and enter the details to create account")
	public static void ypIf(DataTable data)
	{//YOUR PERSONAL INFORMATION
	    /* Verify radio buttons 'Mr' and 'Ms' are  present  and select any one radio button
	     *Verify 'Frist name''Last name' 'Password Text' Text Box exist if exist send values to Text Box 
	     * Verify  'Date of Birth' Dropdown exist if exist Select  'Date of Birth' from Drop Down
	     * Verify 'Your address header' is present is present enter Address
	     *Verify 'Frist name' 'Last name''Company' 'Address (Line 2)'  
	     * 'City 'Text Box exist under 'Your address' header if exist send values Text Box 
	     * Verify  'State' 'Zip/Postal Code' 'Country' Dropdown exist if exist Select the  Option from Drop Down,
	     * 'Additional information'Text Box exist if exist send value to 'Additional information' Text Box
	     * 'Home phone' 'Mobile phone' 'Assign an address alias for future reference' Text Box exist if exist send values to Text Box
	     * 
	     */
	    
	    try{ if(Lnk_CreateHeader.getText().equalsIgnoreCase("YOUR PERSONAL INFORMATION"))
	    {
	        System.out.println("YOUR PERSONAL INFORMATION is present in Create Account");
	    }
	    }catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	    
	    
	    //radio button
	       try{
	    	   List<List<String>>  rb=data.raw();
	        
	        if(rb.get(0).get(0).equalsIgnoreCase("Mr"))
	        {
	        
	        	GenericMethods.overClick(Mr_rdbtn);
	        }
	        if(rb.get(0).get(0).equalsIgnoreCase("Mrs"))
	        {
	           
	        	GenericMethods.overClick(Mrs_rdbtn);
	        }
	       }catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	        
	        //Frist Name text box
	        
	       try{ List<List<String>>  FLP=data.raw();
	       
	    String fvt=Frst_label.getText().trim();
	    System.out.println(fvt);
	    if(fvt.equalsIgnoreCase("First name *"))
	    {
	    System.out.println("First name text box present");
	    
	    Frst_txt.sendKeys(FLP.get(1).get(0));
	    
	    }

	    //Last name text box
	    
	    String Lvt=last_label.getText().trim();
	    System.out.println(Lvt);
	    if(Lvt.equalsIgnoreCase("Last name *"))
	    {
	        System.out.println("Last name text box present");
	   
	        last_txt.sendKeys(FLP.get(2).get(0));
	    
	    
	    }

	    //Password textbox

	    String pvt=    pass_label.getText().trim();
	    System.out.println(pvt);
	    if(pvt.equalsIgnoreCase("Password *"))
	    {
	        System.out.println("Password  text box present");
 
	        
	        pass_txt.sendKeys(FLP.get(3).get(0));
	    }}catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	        
	    //Date of Birth    
	
	    try{
	    	String dobt=days_label.getText().trim();
	    System.out.println(dobt);
	    if(dobt.equalsIgnoreCase("Date of Birth"))
	    {
	        System.out.println("Date of Birth dropdown present");
	    
	        GenericMethods. overClick(days_drpw);
	    
	        GenericMethods. overClick(mnth_drpw);
	    
	        GenericMethods. overClick(year_drpw);
	    }
	    System.out.println("Date of Birth Selected");    
	        
	    }catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	    
	    
	   
	    
	    try{//'Your address header' is present is present enter Address
	
	    
	    System.out.println(yadd_header.getText());
	    if(yadd_header.getText().equalsIgnoreCase("YOUR ADDRESS"))
	    {
	        System.out.println("YOUR ADDRESS present and enter address details");
	        
	    }
	    
	    //First name of Address
	    
	    List<List<String>>  FLA=data.raw();
	   
	String fvd=    addfristna_label.getText().trim();
	System.out.println(fvd);
	if(fvd.equalsIgnoreCase("First name *"))
	{
	System.out.println("First name text box present in address");
	
	addfristna_txt.clear();
	addfristna_txt.sendKeys(FLA.get(4).get(0));
	}
	}catch(Exception e)
		   {
		   System.out.println(e.getMessage());
	   }
	    
	try{
		//Last name
	List<List<String>>  LLA=data.raw();
	
	String Lvd=    addlastna_label.getText().trim();
	System.out.println(Lvd);
	if(Lvd.equalsIgnoreCase("Last name *"))
	{
	System.out.println("Last name text box present in address");
	
	addlastna_txt.clear();
	
	addlastna_txt.sendKeys(LLA.get(5).get(0));
	
	
	}
	}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }

	
	try{
		//Company
		List<List<String>>  cmA=data.raw();
	
	
	String cvd=   comp_label.getText().trim();
	System.out.println(cvd);
	if(cvd.equalsIgnoreCase("Company"))
	{
	System.out.println("Last name text box present in address");
	comp_txt.clear();
	
   comp_txt.sendKeys(cmA.get(6).get(0));
	
	
	}
	}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }


	try{
		//Address
	
	List<List<String>>  Adder=data.raw();
	
	String addvd=add1_label.getText().trim();
	System.out.println(addvd);
	if(addvd.equalsIgnoreCase("Address *"))
	{
	System.out.println("Address text box present in address");
	
	add1_txt.clear();
	
	add1_txt.sendKeys(Adder.get(7).get(0));
	}}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }


	try{
		//Address (Line 2)
	List<List<String>>  Adderl=data.raw();
	
	String addvdl=add2_label.getText().trim();
	System.out.println(addvdl);
	if(addvdl.equalsIgnoreCase("Address (Line 2)"))
	{
	System.out.println("Address (Line 2) text box present in address");
	
	add2_txt.clear();
	add2_txt.sendKeys(Adderl.get(8).get(0));
	}


	//city
	List<List<String>>  cit=data.raw();
	
	String cvdl=city_label.getText().trim();
	System.out.println(cvdl);
	if(cvdl.equalsIgnoreCase("City *"))
	{
	System.out.println("city text box present in address");
	
	city_txt.clear();
	
	city_txt.sendKeys(cit.get(9).get(0));
	}

	//State *


	
	String svdl=state_label.getText().trim();
	System.out.println(svdl);
	if(svdl.equalsIgnoreCase("State *"))
	{
	System.out.println("State dropdown present in address");
	
	
	GenericMethods.overClick(state_drpw);

	}

	//Zip/Postal Code *


	
	String pcdl=post_label.getText().trim();
	System.out.println(cvdl);
	if(pcdl.equalsIgnoreCase("Zip/Postal Code *"))
	{
	System.out.println("Zip/Postal Code * text box present in address");
	
	post_txt.clear();
	
	post_txt.sendKeys(Adderl.get(10).get(0));
	
	}


	//Additional information

	
	String addl=info_label.getText().trim();
	System.out.println(addl);
	if(addl.equalsIgnoreCase("Additional information"))
	{
	System.out.println("Additional information text box present in address");
	
	
	info_txt.clear();
	info_txt.sendKeys(Adderl.get(11).get(0));
	
	
	}

	//Home phone


	
	String hdl=hmph_label.getText().trim();
	System.out.println(hdl);
	if(hdl.equalsIgnoreCase("Home phone"))
	{
	System.out.println("Home phone text box present in address");
	hmph_txt.clear();
	hmph_txt.sendKeys(Adderl.get(12).get(0));
	
	
	}


	//Mobile phone *
	
	String mdl=mbph_label.getText().trim();
	System.out.println(mdl);
	if(mdl.equalsIgnoreCase("Mobile phone *"))
	{
	System.out.println("Mobile phone text box present in address");
	mbph_txt.clear();
	mbph_txt.sendKeys(Adderl.get(13).get(0));
	
	
	}

	//Assign an address alias for future reference. *

	
	String amdl=alias_label.getText().trim();
	System.out.println(mdl);
	if(amdl.equalsIgnoreCase("Assign an address alias for future reference. *"))
	{
	System.out.println("Assign an address text box present in address");
	
	alias_txt.clear();
	alias_txt.sendKeys(Adderl.get(14).get(0));
	
	
	
	
	}}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	}


	@Then("Click on 'Register'  button")
	public static  void Regis()
	{//register button
	   
		try{GenericMethods.overClick(reg_btn);
	    driver.getTitle();
	    System.out.println(driver.getTitle());
		}catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	    
		try{
			if(_userinfo_label.getText().equalsIgnoreCase("Revathi Lakshmi"))
	    {
	        System.out.println("Account created");
	    }}catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	    
	    
	    driver.close();
	}



	}









