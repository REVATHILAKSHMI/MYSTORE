package com.Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_Email extends GenericMethods {
	
	
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
	
	WebElement ele=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	
String s=ele.getText().trim();

	System.out.println(s);
	System.out.println("Sig-in is present in My store");
	if(s.equalsIgnoreCase("Sign in"))
	{
		ele.click();
		System.out.println("Sin-in is Clicked");
	}
	
}

@Then("In 'sign page'  Verify  'Create- Account header' is available or not")
public static void createAcc()
{
	WebElement ema=driver.findElement(By.xpath("//h3[text()='Create an account']"));
	String ema1=ema.getText().trim();
	System.out.println(ema1);
	if(ema1.equalsIgnoreCase("CREATE AN ACCOUNT"))
	{
		System.out.println("In 'sign page'   'Create- Account header' is available");
	}
	
}

@And("Verify 'Email address' is preasent under Create Account if present enter a valid Email-id if mailid exist should display error messege")
public static void aeEid(DataTable email)
{
	
	//verify Email address text
	WebElement em=driver.findElement(By.xpath("//label[text()='Email address']"));
	String ema2=em.getText();
	System.out.println(ema2);
	if(ema2.equalsIgnoreCase("Email address"))
	{
		System.out.println("Email address' is preasent under Create Account");
	}
	//Sending Data to Email address text box
	List<List<String>>  emid=email.raw();
	driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']")).sendKeys(emid.get(0).get(0));;
	WebElement ca=driver.findElement(By.xpath("//div[@class='submit']/button"));
	ca.click();
	System.out.println("Email id  entered incorrect");
	WebElement em1=driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li"));
	System.out.println(em1.getText());
	
	
}

@Then("If Email-id entered is  valid and does not exist then create a new account by Clicking on Create Account  Button")
public static void e(DataTable email )
{
	//If Email-id entered is  valid and does not exist then create a new account
	List<List<String>>  emid=email.raw();
	WebElement vmid=driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']"));
	vmid.clear();
	vmid.sendKeys(emid.get(0).get(0));
	
	System.out.println("Email id entered");
	
	WebElement ca=driver.findElement(By.xpath("//div[@class='submit']/button"));
	ca.click();
	System.out.println("Create an account button is clicked");
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
	
	
	WebElement ypif=driver.findElement(By.xpath("//h3[text()='Your personal information']"));
	System.out.println(ypif.getText());
	if(ypif.getText().equalsIgnoreCase("YOUR PERSONAL INFORMATION"))
	{
		System.out.println("YOUR PERSONAL INFORMATION is present in Create Account");
	}
	
	
	
	//radio button
		List<List<String>>  rb=data.raw();
		
		if(rb.get(0).get(0).equalsIgnoreCase("Mr"))
		{
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		}
		if(rb.get(0).get(0).equalsIgnoreCase("Mrs"))
		{
			driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		}
		
		//Frist Name text box
		
		List<List<String>>  FLP=data.raw();
		WebElement fv=driver.findElement(By.xpath("//label[@for='customer_firstname']"));
	String fvt=	fv.getText().trim();
	System.out.println(fvt);
	if(fvt.equalsIgnoreCase("First name *"))
	{
	System.out.println("First name text box present");
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(FLP.get(1).get(0));
	}

	//Last name text box
	WebElement Lv=driver.findElement(By.xpath("//label[@for='customer_lastname']"));
	String Lvt=	Lv.getText().trim();
	System.out.println(Lvt);
	if(Lvt.equalsIgnoreCase("Last name *"))
	{
		System.out.println("Last name text box present");
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(FLP.get(2).get(0));
	}

	//Password textbox
	WebElement pv=driver.findElement(By.xpath("//label[@for='passwd']"));
	String pvt=	pv.getText().trim();
	System.out.println(pvt);
	if(pvt.equalsIgnoreCase("Password *"))
	{
		System.out.println("Password  text box present");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(FLP.get(3).get(0));	
	}
		
	//Date of Birth	
	WebElement dob=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
	String dobt=dob.getText().trim();
	System.out.println(dobt);
	if(dobt.equalsIgnoreCase("Date of Birth"))
	{
		System.out.println("Date of Birth dropdown present");
	WebElement d=driver.findElement(By.xpath("//select[@id='days']/option[2]"));	
	d.click();
	
	WebElement m=driver.findElement(By.xpath("//select[@id='months']/option[2]"));
	m.click();
	
	WebElement y=driver.findElement(By.xpath("//select[@id='years']/option[28]"));
	y.click();
	
	}
	System.out.println("Date of Birth Selected");	
		
	//'Your address header' is present is present enter Address
WebElement add=	driver.findElement(By.xpath("//h3[text()='Your address']"));
	
	System.out.println(add.getText());
	if(add.getText().equalsIgnoreCase("YOUR ADDRESS"))
	{
		System.out.println("YOUR ADDRESS present and enter address details");
		
	}
	
	//First name of Address
	
	List<List<String>>  FLA=data.raw();
	WebElement fva=driver.findElement(By.xpath("//label[@for='firstname']"));
String fvd=	fva.getText().trim();
System.out.println(fvt);
if(fvt.equalsIgnoreCase("First name *"))
{
System.out.println("First name text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='firstname']"));
fsn.clear();
fsn.sendKeys(FLA.get(4).get(0));
}
	
//Last name
List<List<String>>  LLA=data.raw();
WebElement Lva=driver.findElement(By.xpath("//label[@for='lastname']"));
String Lvd=	Lva.getText().trim();
System.out.println(Lvd);
if(Lvd.equalsIgnoreCase("Last name *"))
{
System.out.println("Last name text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='lastname']"));
fsn.clear();
fsn.sendKeys(LLA.get(5).get(0));
}

//Company
List<List<String>>  cmA=data.raw();
WebElement cva=driver.findElement(By.xpath("//label[@for='company']"));
String cvd=	cva.getText().trim();
System.out.println(cvd);
if(cvd.equalsIgnoreCase("Company"))
{
System.out.println("Last name text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='company']"));
fsn.clear();
fsn.sendKeys(cmA.get(6).get(0));
}


//Address
List<List<String>>  Adder=data.raw();
WebElement adva=driver.findElement(By.xpath("//label[@for='address1']"));
String addvd=adva.getText().trim();
System.out.println(addvd);
if(addvd.equalsIgnoreCase("Address *"))
{
System.out.println("Address text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='address1']"));
fsn.clear();
fsn.sendKeys(Adder.get(7).get(0));
}


//Address (Line 2)
List<List<String>>  Adderl=data.raw();
WebElement adval=driver.findElement(By.xpath("//label[@for='address2']"));
String addvdl=adval.getText().trim();
System.out.println(addvdl);
if(addvdl.equalsIgnoreCase("Address (Line 2)"))
{
System.out.println("Address (Line 2) text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='address2']"));
fsn.clear();
fsn.sendKeys(Adderl.get(8).get(0));
}


//city
List<List<String>>  cit=data.raw();
WebElement cval=driver.findElement(By.xpath("//label[@for='city']"));
String cvdl=cval.getText().trim();
System.out.println(cvdl);
if(cvdl.equalsIgnoreCase("City *"))
{
System.out.println("city text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='city']"));
fsn.clear();
fsn.sendKeys(cit.get(9).get(0));
}

//State *


WebElement sval=driver.findElement(By.xpath("//label[@for='id_state']"));
String svdl=sval.getText().trim();
System.out.println(svdl);
if(svdl.equalsIgnoreCase("State *"))
{
System.out.println("State dropdown present in address");
WebElement fsn=driver.findElement(By.xpath("//select[@id='id_state']/option[16]"));
fsn.click();

}

//Zip/Postal Code *


WebElement pcal=driver.findElement(By.xpath("//label[@for='postcode']"));
String pcdl=pcal.getText().trim();
System.out.println(cvdl);
if(pcdl.equalsIgnoreCase("Zip/Postal Code *"))
{
System.out.println("Zip/Postal Code * text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='postcode']"));
fsn.clear();
fsn.sendKeys(Adderl.get(10).get(0));
}


//Additional information

WebElement adal=driver.findElement(By.xpath("//label[@for='other']"));
String addl=adal.getText().trim();
System.out.println(addl);
if(addl.equalsIgnoreCase("Additional information"))
{
System.out.println("Additional information text box present in address");
WebElement fsn=driver.findElement(By.xpath("//textarea[@id='other']"));
fsn.clear();
fsn.sendKeys(Adderl.get(11).get(0));
}

//Home phone


WebElement hal=driver.findElement(By.xpath("//label[@for='phone']"));
String hdl=hal.getText().trim();
System.out.println(hdl);
if(hdl.equalsIgnoreCase("Home phone"))
{
System.out.println("Home phone text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='phone']"));
fsn.clear();
fsn.sendKeys(Adderl.get(12).get(0));
}


//Mobile phone *
WebElement mal=driver.findElement(By.xpath("//label[@for='phone_mobile']"));
String mdl=mal.getText().trim();
System.out.println(mdl);
if(mdl.equalsIgnoreCase("Mobile phone *"))
{
System.out.println("Mobile phone text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
fsn.clear();
fsn.sendKeys(Adderl.get(13).get(0));
}

//Assign an address alias for future reference. *

WebElement amal=driver.findElement(By.xpath("//label[@for='alias']"));
String amdl=amal.getText().trim();
System.out.println(mdl);
if(amdl.equalsIgnoreCase("Assign an address alias for future reference. *"))
{
System.out.println("Assign an address text box present in address");
WebElement fsn=driver.findElement(By.xpath("//input[@id='alias']"));
fsn.clear();
fsn.sendKeys(Adderl.get(14).get(0));
}
}


@Then("Click on 'Register'  button")
public static  void Regis()
{
	WebElement reg=driver.findElement(By.xpath("//button[@id='submitAccount']"));
	reg.click();
	driver.getTitle();
	System.out.println(driver.getTitle());
WebElement e=driver.findElement(By.xpath("//div[@class='header_user_info']/a/span"));
e.getText();
	if(e.getText().equalsIgnoreCase("Revathi Lakshmi"))
	{
		System.out.println("Account created");
	}
	
	
	driver.close();
}



}












	














