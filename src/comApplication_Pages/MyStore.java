package comApplication_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class MyStore extends GenericMethods {
	@FindBy(how=How.XPATH,using="//a[@title='My Store']/img" )
	public static WebElement your_img;
	
	@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']" )
	public static WebElement Lnk_Sigin;
	
	 @FindBy(how=How.XPATH,using="//h3[text()='Create an account']")
	    public static WebElement CreAcc_Header;
	    
	 @FindBy(how=How.XPATH,using="//label[text()='Email address']")
	    public static WebElement Emailadd_Header;
	    
	  @FindBy(how=How.XPATH,using="//input[@class='is_required validate account_input form-control']")
	    public static WebElement Emailiput_txt;
	    
	  @FindBy(how=How.XPATH,using="//div[@class='submit']/button")
	    public static WebElement Createacc_btn;
	    
	 @FindBy(how=How.XPATH,using="//div[@class='alert alert-danger']/ol/li")
	    public static WebElement Eror_Msg;
	 
	 
	 @FindBy(how=How.XPATH,using="//h3[text()='Your personal information']" )
	    public static WebElement Create_Header;
		//Mr and mrs radio button
		@FindBy(how=How.XPATH,using="//input[@id='id_gender1']" )
	    public static WebElement Mr_rdbtn;
		
		@FindBy(how=How.XPATH,using="//input[@id='id_gender2']" )
	    public static WebElement Mrs_rdbtn;
		
		//Frist name
		@FindBy(how=How.XPATH,using="//label[@for='customer_firstname']" )
	    public static WebElement Frst_label;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='customer_firstname']" )
	    public static WebElement Frst_txt;
		
		//Last name
		@FindBy(how=How.XPATH,using="//label[@for='customer_lastname']" )
	    public static WebElement last_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='customer_lastname']" )
	    public static WebElement last_txt;
		
		
		//password
		
		@FindBy(how=How.XPATH,using="//label[@for='passwd']" )
	    public static WebElement pass_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='passwd']" )
	    public static WebElement pass_txt;
		
		
	//Date of Birth 
		
		@FindBy(how=How.XPATH,using="//label[text()='Date of Birth']" )
	    public static WebElement days_label;	
		
		@FindBy(how=How.XPATH,using="//select[@id='days']/option[2]" )
	    public static WebElement days_drpw;
		
		@FindBy(how=How.XPATH,using="//select[@id='months']/option[2]" )
	    public static WebElement mnth_drpw;
		
		@FindBy(how=How.XPATH,using="//select[@id='years']/option[28]" )
	    public static WebElement year_drpw;
		
		
		//youaddress header
		@FindBy(how=How.XPATH,using="//h3[text()='Your address']" )
	    public static WebElement yadd_header;
		
		
		//First name of Address
		
		@FindBy(how=How.XPATH,using="//label[@for='firstname']" )
	    public static WebElement addfristna_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='firstname']" )
	    public static WebElement addfristna_txt;
		
		//Last name
		@FindBy(how=How.XPATH,using="//label[@for='lastname']" )
	    public static WebElement addlastna_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='lastname']" )
		
		 public static WebElement addlastna_txt;
		
		//Company
		
		@FindBy(how=How.XPATH,using="//label[@for='company']" )
	    public static WebElement comp_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='company']" )
		
		 public static WebElement comp_txt;
		
		//Address
		@FindBy(how=How.XPATH,using="//label[@for='address1']" )
	    public static WebElement add1_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='address1']" )
		 public static WebElement add1_txt;
		
		//Address (Line 2)
		@FindBy(how=How.XPATH,using="//label[@for='address2']" )
	    public static WebElement add2_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='address2']" )
		  public static WebElement add2_txt;
		
		
		//city
		
		@FindBy(how=How.XPATH,using="//label[@for='city']" )
	    public static WebElement city_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='city']" )
		  public static WebElement city_txt;
		
		
		//State *
		
		@FindBy(how=How.XPATH,using="//label[@for='id_state']" )
	    public static WebElement state_label;
		
		@FindBy(how=How.XPATH,using="//select[@id='id_state']/option[16]" )
		  public static WebElement state_drpw;
		
		
		//Zip/Postal Code *
		@FindBy(how=How.XPATH,using="//label[@for='postcode']" )
	    public static WebElement post_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='postcode']" )
		  public static WebElement post_txt;
		
		
		//Additional information
		
		@FindBy(how=How.XPATH,using="//label[@for='other']" )
	    public static WebElement info_label;
		
		@FindBy(how=How.XPATH,using="//textarea[@id='other']" )
		  public static WebElement info_txt;
		
		//Home phone
		
		@FindBy(how=How.XPATH,using="//label[@for='phone']" )
	    public static WebElement hmph_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='phone']" )
		  public static WebElement  hmph_txt;
		
		//Mobile phone *
		
		@FindBy(how=How.XPATH,using="//label[@for='phone_mobile']" )
	    public static WebElement mbph_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='phone_mobile']" )
		  public static WebElement  mbph_txt;
		
		
		//Assign an address alias for future reference.
		
		@FindBy(how=How.XPATH,using="//label[@for='alias']" )
	    public static WebElement alias_label;
		
		@FindBy(how=How.XPATH,using="//input[@id='alias']" )
		  public static WebElement  alias_txt;
		
		
		
		//register button
		
		
		@FindBy(how=How.XPATH,using="//button[@id='submitAccount']" )
	    public static WebElement reg_btn;
		
		
		@FindBy(how=How.XPATH,using="//div[@class='header_user_info']/a/span" )
	    public static WebElement _userinfo_label;

}
