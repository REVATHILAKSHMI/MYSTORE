
package com.EmailTestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_02_InvalidEmail extends GenericMethods{

@When("Click on Sigin  menu and navigate to Create Account and enter invalid Emai-lid")
public static void Invalid(DataTable email)
{
System.out.println("To Verify  Sig-in link is present in My store");
	//sign-in link
	WebElement ele=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	
String s=ele.getText().trim();

	System.out.println(s);
	System.out.println("Sig-in is present in My store");
	if(s.equalsIgnoreCase("Sign in"))
	{
		ele.click();
		System.out.println("Sin-in is Clicked");
	}
	
	
	
	//verify create account
	WebElement ema=driver.findElement(By.xpath("//h3[text()='Create an account']"));
	String ema1=ema.getText().trim();
	System.out.println(ema1);
	if(ema1.equalsIgnoreCase("CREATE AN ACCOUNT"))
	{
		System.out.println("In 'sign page'   'Create- Account header' is available");
		}
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
		WebElement ivalem=driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']"));
		ivalem.clear();
		ivalem.sendKeys(emid.get(0).get(0));
		
		WebElement ca=driver.findElement(By.xpath("//div[@class='submit']/button"));
		ca.click();
		System.out.println("Email id  entered incorrect");
		WebElement em1=driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li[1]"));
		String erro=em1.getText();
		System.out.println(erro);
		

}
}
