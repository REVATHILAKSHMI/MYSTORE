package com.Tesecases;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Tc_02_Dresses extends GenericMethods  {

	@Given("Dresses page opned succesfully and Dress section is present Dresses section menu")	
	public static void dresses()
	{
		boolean status=true;
		
	WebElement dress=	driver.findElement(By.xpath("//div[@class='sf-contener clearfix col-lg-12']/ul/li[2]/a"));
	status=overClick(dress);
	System.out.println("Dresses page opened succes fully");
	if(status=true)
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
	String a[]={"Casual Dresses","Evening Dresses","Summer Dresses"};
	
	List<WebElement>  boxes=driver.findElements(By.xpath("//div[@id='categories_block_left']/div/ul[1]/li/a"));

	int n=boxes.size();

		String check[]=new String[n];
		for(int i=0;i<boxes.size();i++)
		{
			check[i]=boxes.get(i).getText().trim();
			System.out.println(check[i]);
			if(check[i].contains(a[i]))
			{
				System.out.println(a[i]+"option is present in Dress menu ");
			}
			}
		}

	
	@When("Catalog menu options")
	public static void Catalog()
	{
	if(driver.findElement(By.xpath("//p[text()='Catalog']")).isDisplayed())
	{
		System.out.println("Catalog is present");
	}
	else
	{
		System.out.println("Catalog is not present");
	}
	
	boolean status=true;
	Scanner sc = new Scanner(System.in);
	System.out.println("checkboxes  need to be selected");
	
	int value = sc.nextInt();

	
		switch (value)
		{
		
		case 1:
			driver.findElement(By.xpath("//label/*[text()='Evening Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).click();
		status=	driver.findElement(By.xpath("//label/*[text()='Evening Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).isSelected();
		if (status = true)
		{
			System.out.println("Evening dresses clicked");
		}
		else
		{
			
			System.out.println("Evening dresses is not clicked");
			}
		break;
		
		
		case  2:
			driver.findElement(By.xpath("//label/*[text()='Casual Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).click();
		status=	driver.findElement(By.xpath("//label/*[text()='Casual Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).isSelected();
		if (status = true)
		{
			System.out.println(" Casual Dresses  clicked");
		}
		else
		{
			
			System.out.println(" Casual Dresses is not clicked");
			}
		break;
		
		case  3:
			driver.findElement(By.xpath("//label/*[text()='Summer Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).click();
		status=	driver.findElement(By.xpath("//label/*[text()='Summer Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).isSelected();
		if (status = true)
		{
			System.out.println(" Summer Dresses  clicked");
		}
		else
		{
			
			System.out.println(" Summer Dresses is not clicked");
			}
		break;
		
		default:
			System.out.println(" Unable to find element");
		
}
		
	}
}
	
		
		
	


	
	

