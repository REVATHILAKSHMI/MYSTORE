package comApplication_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class AutomationPracticehomepage extends GenericMethods {

	
	
	@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']" )
	public static WebElement Lnk_Sigin;
	
//===================================================================================	
/*MetodName:clickSigin
 * Purpose:To click on Register Link
 * Input Parameters:
 * Return Type:boolean(True)
 * Dependency:
 * Date of Creation:23-November-2018
 * Created By:Revathi
 * Reviewed By:
 * Modified Date:	
 */
	//==========================Method to Click on Register Link=======================
	
	public static boolean clickSigin()
	{
		boolean  Status=true;
		try{//move to Register link and Click the Register link
			
			Status=overClick(Lnk_Sigin);
			
		}
		
		catch(Exception e)
		{
			 Status=false;
			System.out.println(e.getMessage());
		}
		return false;
	}

}


