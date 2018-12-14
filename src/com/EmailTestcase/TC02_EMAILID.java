package com.EmailTestcase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;


import comApplication_Pages.MyStore;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class TC02_EMAILID  extends MyStore{
	
	
	MyStore mystore=PageFactory.initElements(driver,MyStore.class);
	
public static boolean Stepstatus=true;
    
	@Given("^Launch \"([^\"]*)\" Browser and load Url$") 
	    public static boolean launch(String broser,DataTable data)
	    {
		List<List<String>>  url=data.raw();
		
		String URl=url.get(0).get(0);
		
		
	        // to launch browser
	        GenericMethods.launchBrowser(broser,URl );
	    
	    //to maximize window
	    driver.manage().window().maximize();
	    return Stepstatus=true;
	        
	    }
	  

	@When("Verify 'Sign-in link' is available in 'My Store' page If Sig-in exist click on Sigin")
	public static void Sigin()
	{
		boolean Status;
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
	
	Status=	your_img.isDisplayed();
		
		if(Status)
		{
			System.out.println("logo is displayed");
		}
		else{
			System.out.println("logo is not displayed");
		}
	    System.out.println("To Verify  Sig-in link is present in My store");
	    //Lnk_Sigin.isDisplayed();
		System.out.println(Lnk_Sigin.isDisplayed());
	    
	try{
		if(Status)
		{
		
		String s=Lnk_Sigin.getText().trim();
		System.out.println(s);
	    System.out.println("Sig-in is present in My store");
	    if(s.equalsIgnoreCase("Sign in"))
	    {
	    	mystore.overClick(Lnk_Sigin);
	    	
	    	
	    	//GenericMethods.overClick(Lnk_Sigin);
	        System.out.println("Sin-in is Clicked");
	    }
		}
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	    
	}

	@Then("In 'sign page'  Verify  'Create- Account header' is available or not")
	public static void createAcc()
	{
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
		boolean Status=true;
		System.out.println(CreAcc_Header.isDisplayed());
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
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
		 
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
	    
	   String emailid=emid.get(0).get(0);
	   
	   mystore.clickandSendData(Emailiput_txt,emailid);
	   
	    mystore. overClick(Createacc_btn);  
	    
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
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
	    //If Email-id entered is  valid and does not exist then create a new account
	   try{
		   
		   List<List<String>>  emid=email.raw();
	   
		   
		   String emailid=emid.get(0).get(0);
		   
		   String[] arr=emailid.split("@");
			
			Date d=new Date();
			
			SimpleDateFormat sdf=new SimpleDateFormat("hhmmss");
			
			System.out.println(arr[0]+sdf.format(d)+"@"+arr[1]);
			
			emailid=arr[0]+sdf.format(d)+"@"+arr[1];
			//new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(Emailiput_txt));
		 mystore.clickandSendData(Emailiput_txt,emailid);  
	    System.out.println("Email id entered");
	    mystore. overClick(Createacc_btn);
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
 List<List<String>>  rb=data.raw();
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
	    try{ if(Create_Header.getText().equalsIgnoreCase("YOUR PERSONAL INFORMATION"))
	    {
	        System.out.println("YOUR PERSONAL INFORMATION is present in Create Account");
	    }
	    }catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	    
	    
	  //radio button
	       try{
	    	   String radiobutton=rb.get(0).get(0);
	        
	        if(radiobutton.equalsIgnoreCase("Mr"))
	        {
	        	mystore.overClick(Mr_rdbtn);
	        	if(mystore.overClick(Mr_rdbtn))
	        	{
	        	System.out.println("Mr is clicked");
	        	}
	        }
	        if(radiobutton.equalsIgnoreCase("Mrs"))
	        {
	           
	        	mystore.overClick(Mrs_rdbtn);
	        	
	        	
	        	if(mystore.overClick(Mrs_rdbtn))
	        	{
	        	System.out.println("Mrs is clicked");
	        	}
	        }
	       }catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	        //Frist Name text box
	        
	       try{
//	    	   List<List<String>>  FLP=data.raw();
	       
	    String fvt=Frst_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	    System.out.println(fvt);
	    if(fvt.equalsIgnoreCase("First name"))
	    {
	    System.out.println("First name text box present");
	    
	    String fristname=rb.get(0).get(1);
	    
	   // mystore.clickandSendData(Frst_txt,fristname);
	    mystore.displayedsend(Frst_txt, fristname);
	    
	    
	    System.out.println("Frist name entered");
	    
	    }

	    //Last name text box
	    
	    String Lvt=last_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	    System.out.println(Lvt);
	    if(Lvt.equalsIgnoreCase("Last name"))
	    {
	        System.out.println("Last name text box present");
	   
	        
	        String lastname=rb.get(0).get(2);
	     
	        mystore.clickandSendData(last_txt,lastname);
	        
	        System.out.println("last name entered");
	    
	    }

	    //Password textbox

	    String pvt=    pass_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	    System.out.println(pvt);
	    if(pvt.equalsIgnoreCase("Password"))
	    {
	        System.out.println("Password  text box present");
 
	        
	   String passwrd=rb.get(0).get(3);
	        mystore.clickandSendData(pass_txt,passwrd);
	        
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
	    
	        mystore. overClick(days_drpw);
	    
	        mystore. overClick(mnth_drpw);
	    
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
	    
//	    List<List<String>>  FLA=data.raw();
	   
	String fvd=    addfristna_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(fvd);
	if(fvd.equalsIgnoreCase("First name"))
	{
	System.out.println("First name text box present in address");
	
	String addfristname=rb.get(0).get(4);
	  mystore.clickandSendData(addfristna_txt,addfristname);
	
	
	}
	}catch(Exception e)
		   {
		   System.out.println(e.getMessage());
	   }
	    
	try{
		//Last name
//	List<List<String>>  LLA=data.raw();
	
	String Lvd=    addlastna_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(Lvd);
	if(Lvd.equalsIgnoreCase("Last name"))
	{
	System.out.println("Last name text box present in address");
	
	String addLastname=rb.get(0).get(5);
	
	 mystore.clickandSendData(addlastna_txt,addLastname);
		
	}
	}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }

	
	try{
		//Company
//		List<List<String>>  cmA=data.raw();
	
	
	String cvd=   comp_label.getText().trim();
	System.out.println(cvd);
	if(cvd.equalsIgnoreCase("Company"))
	{
	System.out.println("Last name text box present in address");
	
	String company=rb.get(0).get(6);
	
	
	 mystore.clickandSendData(comp_txt,company);
	
	}
	}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }


	try{
		//Address
	
//	List<List<String>>  Adder=data.raw();
	
	String addvd=add1_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(addvd);
	if(addvd.equalsIgnoreCase("Address"))
	{
	System.out.println("Address text box present in address");
	
	String addres1=rb.get(0).get(7);
	
	mystore.clickandSendData(add1_txt,addres1);
	
	
	}}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }


	try{
		//Address (Line 2)
	//List<List<String>>  Adderl=data.raw();
	
	String addvdl=add2_label.getText().trim();
	System.out.println(addvdl);
	if(addvdl.equalsIgnoreCase("Address (Line 2)"))
	{
	System.out.println("Address (Line 2) text box present in address");
	
	String addres2=rb.get(0).get(8);
	
	mystore.clickandSendData(add2_txt,addres2);
	
	}


	//city
//	List<List<String>>  cit=data.raw();
	
	String cvdl=city_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(cvdl);
	if(cvdl.equalsIgnoreCase("City"))
	{
	System.out.println("city text box present in address");
	
	String city=rb.get(0).get(9);
	
	mystore.clickandSendData(city_txt,city);
	
	
	}

	//State *
	String svdl=state_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(svdl);
	if(svdl.equalsIgnoreCase("State"))
	{
	System.out.println("State dropdown present in address");
	
	
	GenericMethods.overClick(state_drpw);

	}

	//Zip/Postal Code *


	
	String pcdl=post_label.getText().replaceAll("[^a-zA-Z0-9/]", " ").trim();
	System.out.println(cvdl);
	if(pcdl.equalsIgnoreCase("Zip/Postal Code"))
	{
	System.out.println("Zip/Postal Code  text box present in address");
	
	String zip=rb.get(0).get(10);
	
	mystore.clickandSendData(post_txt,zip);
	}


	//Additional information

	
	String addl=info_label.getText().trim();
	System.out.println(addl);
	if(addl.equalsIgnoreCase("Additional information"))
	{
	System.out.println("Additional information text box present in address");
	
	
	String Addinfo=rb.get(0).get(11);
	mystore.clickandSendData(info_txt,Addinfo);
	}

	//Home phone


	
	String hdl=hmph_label.getText().trim();
	System.out.println(hdl);
	if(hdl.equalsIgnoreCase("Home phone"))
	{
	System.out.println("Home phone text box present in address");
	
	String homephone=rb.get(0).get(12);
	
	mystore.clickandSendData(hmph_txt,homephone);
	
	
	}


	//Mobile phone *
	
	String mdl=mbph_label.getText().replaceAll("[^a-zA-Z0-9]", " ").trim();
	System.out.println(mdl);
	if(mdl.equalsIgnoreCase("Mobile phone"))
	{
	System.out.println("Mobile phone text box present in address");
	
	String Mobilephone=rb.get(0).get(13);
	
	mystore.clickandSendData(mbph_txt,Mobilephone);
	
	}

	//Assign an address alias for future reference. *

	
	String amdl=alias_label.getText().trim();
	System.out.println(mdl);
	if(amdl.equalsIgnoreCase("Assign an address alias for future reference. *"))
	{
	System.out.println("Assign an address text box present in address");
	
	
	String addalias=rb.get(0).get(14);
	mystore.clickandSendData(alias_txt,addalias);
	
	}}catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	
	
	}
	
	
	


	@Then("Click on 'Register'  button")
	public static  void Regis()
	{//register button
		MyStore mystore=PageFactory.initElements(driver,MyStore.class);
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










	
	


