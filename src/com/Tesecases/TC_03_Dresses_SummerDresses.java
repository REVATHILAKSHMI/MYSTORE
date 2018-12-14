package com.Tesecases;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_Dresses_SummerDresses extends GenericMethods {
	
	public static boolean Stepstatus=true;
	@Given("browser is launched and application url is loaded and maximized")
	public static boolean launch(DataTable data)
	{
		List<List<String>>  url=data.raw();
		// to launch browser
	GenericMethods.launchBrowser("FireFox", url.get(0).get(0));
	
	//to maximize window
	driver.manage().window().maximize();
	return Stepstatus=true;
		
	}

	@When(" Click on Dresses menu and check whether Summer Dresses is present uder Dresses menu")
	public static void dresses()
	{
		boolean statu=true;
		
	WebElement dress=	driver.findElement(By.xpath("//div[@class='sf-contener clearfix col-lg-12']/ul/li[2]/a"));
	statu=overClick(dress);
	System.out.println("Dresses page opened succes fully");
	if(statu=true)
	{
		
		String DressSection=driver.findElement(By.xpath("//div[@id='categories_block_left']/h2")).getText();
		if(DressSection.equalsIgnoreCase("Dresses"))
		{
		System.out.println("Dresses page opened succes fully and and dresses section is present");	
		}
		else
		{
			System.out.println("Unable yo find Dresses section");
		}
	}
	
	
	WebElement boxes=driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul[1]/li[3]/a"));
	

	String f=boxes.getText().trim();
	if(f.equalsIgnoreCase("Summer Dresses"))
			{
				System.out.println("Summer Dresses option is present in Dress menu ");
			}
			statu=overClick(boxes);
			System.out.println("Summer dresses clicked");
	
	}
	
	
@Then("On the Summer dresses page. Click on Sort By: Price and validate whether the product grid is arranged properly")	
public static void summerDresses()
{
	List<WebElement>  options=driver.findElements(By.xpath("//select[@class='selectProductSort form-control']/option"));	
	int opt=options.size();
	System.out.println("Options of  Sorty by are in numer"+opt);
	
	Scanner se = new Scanner(System.in);
	System.out.println("checkboxes  need to be selected");
	
	int  optval= se.nextInt();
	switch(optval)
	{
	case 1:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[1]")).click();

		System.out.println("Selected option is --");
		break;
	case 2:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[2]")).click();

		System.out.println("Selected option is  Price: Lowest Frist");
		break;	
	case 3:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[3]")).click();

		System.out.println("Selected option is  Price: HIghest Frist");
		break;	
		
	case 4:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[4]")).click();

		System.out.println("Selected option is  Product name A-Z");
		break;		
		
		
	case 5:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[5]")).click();

		System.out.println("Selected option is  Product name Z-A");
		break;		
			
		
	case 6:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[6]")).click();

		System.out.println("In Stock");
		break;		
				
		
	case 7:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[7]")).click();

		System.out.println("Reference Lowest frist");
		break;		
					
		
	case 8:
		driver.findElement(By.xpath("//select[@class='selectProductSort form-control']/option[8]")).click();

		System.out.println("Reference Highest frist");
		break;	
		
		default:
			System.out.println(" No such option found");
				
		
	}

	if(optval==2||optval==3)
	{
		
	WebElement eles=	driver.findElement(By.xpath("//img[@alt='Printed Chiffon Dress']"));
	
	Point p=eles.getLocation();
	int X=p.getX();
	int Y=p.getY();
	System.out.println("X -coordinatw from left:" +X+" Pixels");
	System.out.println("X -coordinatw from left:" +Y+" Pixels");	
		
	
	
WebElement elimg=driver.findElement(By.xpath("//img[@alt='Printed Summer Dress']"));
	
	Point o=eles.getLocation();
	int Xa=o.getX();
	int Ya=o.getY();
	System.out.println("X -coordinatw from left:" +Xa+" Pixels");
	System.out.println("X -coordinatw from left:" +Ya+" Pixels");	
		
		
	
	
	}
	
	

}
	
	
		}

	

