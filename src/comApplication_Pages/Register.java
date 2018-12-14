package comApplication_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;
//===========================Register Page======================
//============================webElements==================================
public class Register extends GenericMethods {

	@FindBy(how=How.XPATH,using="//*[@class='submenu-content-block register-form']//*[text()='Learning ']")
    public static WebElement Chi_Learning;
    @FindBy(how=How.XPATH,using="//*[@class='submenu-content-block register-form']//*[text()='Trainee']")
    public static WebElement Lnk_Trainee;
  //===================================================================================	
    /*MetodName:Validate_Learning
     * Purpose:To  Check whether Learning  is present in Register Link
     * Input Parameters:
     * Return Type:boolean(True)
     * Dependency:
     * Date of Creation:23-November-2018
     * Created By:Revathi
     * Reviewed By:
     * Modified Date:	
     */ 
    //===========================Validate_Learning==========================
    public static boolean Validate_Learning()
    {
        boolean status=true;
        try//Verify child learning is present in register link and get text
        {
           String s= Chi_Learning.getText();
            System.out.println(s);
           
        }catch(Exception e)
        {
            status=false;
            System.out.println(e.getMessage());
        }
       
       
       
        return false;
       
    }
    //===================================================================================	
    /*MetodName:clickTrainee
     * Purpose:To  Click on Trainee
     * Input Parameters:
     * Return Type:boolean(True)
     * Dependency:
     * Date of Creation:23-November-2018
     * Created By:Revathi
     * Reviewed By:
     * Modified Date:	
     */ 
    //===========================clickTrainee ==========================
    public static boolean clickTrainee()
    {
        boolean status=true;
        try//move to Trainee link and click the link
        
        {
        	status=overClick(Lnk_Trainee); 
           
        }catch(Exception e)
        {
            status=false;
            System.out.println(e.getMessage());
        }
       
       
       
        return false;


	}
	
}
