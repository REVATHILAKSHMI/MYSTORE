package com.GenericMethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	public static WebDriver driver;
	//===================================================================================	
    /*MetodName:launchBrowser
     * Purpose:To Launch the Browser and enter the URL
     * Input Parameters:browser,URL
     * Return Type:void
     * Dependency:
     * Date of Creation:23-November-2018
     * Created By:Revathi
     * Reviewed By:
     * Modified Date:	
     */ 
	//=======================launchBrowser===========
	public static void launchBrowser(String browser,String URL)
	{
		try
		{// Select the Specific browser
		switch(browser.toLowerCase().trim())
		{
		case "firefox"://To launch FireFoxBrowser
			driver= new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("FireFox Browser launched succesfully");
			break;
		case "chrome"://To Launch Chrome Browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\S3\\Desktop\\chromedriver_win32(1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("chrome Browser launched succesfully");
			break;
		
			default:
				
				System.out.println("Unable to launch browser");
		
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			}
	//==================================================
	/*MetodName:overClick
     * Purpose:mouse over click on WebElement
     * Input Parameters:WebElement
     * Return Type:boolean(true)
     * Dependency:
     * Date of Creation:23-November-2018
     * Created By:Revathi
     * Reviewed By:
     * Modified Date:	
     */ 
	
//===========================overClick=================	
public static boolean overClick(WebElement element)
{

	boolean  Status=true;
	try{//move to Webelement and perform click on the given element
		//new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		//new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).click(element).build().perform();
	
		
	}
	
	catch(Exception e)
	{
		 Status=false;
		System.out.println(e.getMessage());
	}
	return Status;
	
}
//==================================================
	/*MetodName:ClickandSendData
   * Purpose:Click on WebElement and send Data
   * Input Parameters:WebElement,data
   * Return Type:boolean(true)
   * Dependency:
   * Date of Creation:23-November-2018
   * Created By:Revathi
   * Reviewed By:
   * Modified Date:	
   */ 
	
//===========================clickandSendData=================	
public static boolean clickandSendData(WebElement element,String data)
{

	boolean  Status=true;
	try{//Click on Webelement and send the data
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.clear();
		element.sendKeys(data);
		
		
	}
	
	catch(Exception e)
	{
		 Status=false;
		System.out.println(e.getMessage());
	}
	return Status;
	
}


//=======================================================================
public static boolean displayedsend(WebElement element,String data)
{

	boolean  Status=true;
	try{//Click on Webelement and send the data
		if(element.isDisplayed())
		{
			boolean t=element.isDisplayed();
			
			System.out.println(t);
			
			System.out.println(element.getAttribute("name"));
			
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.clear();
		element.sendKeys(data);
		}
		
	}
	
	catch(Exception e)
	{
		 Status=false;
		System.out.println(e.getMessage());
	}
	return Status;
	
}







//==================================================
	/*MetodName:ClickandSendData
 * Purpose:Click on WebElement and send Data
 * Input Parameters:WebElement,data
 * Return Type:boolean(true)
 * Dependency:
 * Date of Creation:23-November-2018
 * Created By:Revathi
 * Reviewed By:
 * Modified Date:	
 */ 
	
//===========================clickandSendData=================	
public static void checkele(String element1,String element2)
{

	
	try{
		if(element1.equalsIgnoreCase(element2))
		{
			System.out.println(element1+ "is displayed");
		}else
		{
			System.out.println(element1+ "is  not displayed");
		}
		
		
	}
	
	catch(Exception e)
	{
		
		System.out.println(e.getMessage());
	}

	
}
//==================================================
	/*MetodName:verifyLink
 * Purpose:Verify the link is broken or not
 * Input Parameters:WebElement,data
 * Return Type:no return type
 * Dependency:
 * Date of Creation:30-November-2018
 * Created By:Revathi
 * Reviewed By:
 * Modified Date:	
 */ 
	
//===========================verifyLinkbro=================	

public static void verifyLinkbro(String urlLink) {
		      
		        try {//to verify whether link is broken or not and return the response
		 
		 URL link = new URL(urlLink);
		 
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 
		 httpConn.setConnectTimeout(2000);

		 httpConn.connect();
		 
		 if(httpConn.getResponseCode()== 200) { 
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 if(httpConn.getResponseCode()==httpConn.HTTP_NOT_FOUND ) {
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 }
		 
		 catch (Exception e) {

		 }
		    } 


//==================================================
	/*MetodName:verifyLinksofpage
 * Purpose:To verify the Link present in the page
 * Input Parameters:
 * Return Type:boolean(true)
 * Dependency:
 * Date of Creation:30-November-2018
 * Created By:Revathi
 * Reviewed By:
 * Modified Date:	
 */ 
	
//=========================== verifyLinksofpage=================	
public static boolean verifyLinksofpage()
{
	boolean status;
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int n=links.size();
	 
	System.out.println("Links of Home Page are:"+n);
	try//to verify links of page
	{
	for(int i=0;i<links.size();i++)
	{  WebElement elemen= links.get(i);
	 String url=elemen.getAttribute("href");
	 
	 String ele=links.get(i).getText();
	 status=links.get(i).isDisplayed();
	
		if(status=true)
		{
			System.out.println(ele);
			
			}
		
		else
		{
			System.out.println("Link is not found ");
		}
		verifyLinkbro(url);
		System.out.println("Font size of link is: "+links.get(i).getCssValue("font-size"));
		
		String k=links.get(i).getCssValue("font-size");
		System.out.println(k);
		if(k=="18")
		{
			System.out.println("FontSize of link is as per the expected value");
		}
		else
		{
			System.out.println("FontSize of link is not as per the expected value");
		}
		
		
		
		System.out.println("color of link is: "+links.get(i).getCssValue("color"));
		
	}
	}catch(Exception e)
	{
		 status=false;
			System.out.println(e.getMessage());
	}
	
		return false;
	
}

//==================================================
	/*MetodName:verifyTextboxesofpage
* Purpose:To get the text boxes present in the page
* Input Parameters:
* Return Type:boolean(true)
* Dependency:
* Date of Creation:30-November-2018
* Created By:Revathi
* Reviewed By:
* Modified Date:	
*/ 
	
//=========================== verifyTextboxesofpage=================	

public static boolean verifyTextboxesofpage()
{
	
	// to display  text boxes of page
		List< WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text']")); 
		int s=textboxes.size();
		boolean status;
		System.out.println(s);
		try
		{
		for(int i=0;i<s;i++)
		{
			 String ele=textboxes.get(i).getAttribute("name");
				status=textboxes.get(i).isDisplayed();
				if(status=true)
				{
					System.out.println("Link name is: "+ele);
				}
				
				else
				{
					System.out.println("Link is not found ");
				}
			System.out.println(textboxes.get(i).getAttribute("id"));
			
			textboxes.get(i).sendKeys("Text");
			
			System.out.println("Font size  of textbox is: "+textboxes.get(i).getCssValue("font-size"));
			
			
			System.out.println("color of textbox is: "+textboxes.get(i).getCssValue("color"));
		}
			
		}catch(Exception e)
		{
			
		}
	return false;
	
}

//==================================================
	/*MetodName:verifyImagesofpage
* Purpose:To get the images present in the page
* Input Parameters:
* Return Type:boolean(true)
* Dependency:
* Date of Creation:30-November-2018
* Created By:Revathi
* Reviewed By:
* Modified Date:	
*/ 
	
//=========================== verifyTextboxesofpage=================	
public static boolean verifyImagesofpage()
{
	
	// to display images of page
		List<WebElement> imagena=driver.findElements(By.tagName("img"));
		int g=imagena.size();
		boolean status=true;
		System.out.println("images of Home Page are:"+g);
		try
		{
			for(int i=1;i<imagena.size();i++)
		
		{
			
			 String ele=imagena.get(i).getAttribute("src");
				status=imagena.get(i).isDisplayed();
				if(status=true)
				{
					System.out.println("Link name is: "+ele);
				}
				
				else
				{
					System.out.println("Link is not found ");
				}
			
			System.out.println("Font size of image  is: "+imagena.get(i).getCssValue("font-size"));
			
			System.out.println("color  of image is: "+imagena.get(i).getCssValue("color"));
			
		}
		}catch(Exception e)
		{
			
		}
		
	return false;
	
}

public static void clicklinksofpageandcomeback()
{
	//to click on allthe links of a page
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int n=links.size();
	 String link[]= new String[n];
	 for(int i=0;i<links.size();i++)
	 {
	 link[i]=links.get(i).getAttribute("href");
	 System.out.println(links.get(i).getAttribute("href"));
	 }
	 for(int i=0;i<links.size();i++)
		{
		driver.navigate().to(link[i]);
		
		driver.navigate().back();
	
	}
		driver.switchTo().defaultContent();
}




















		}


