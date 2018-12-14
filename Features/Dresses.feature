Feature:  build BDD Frame for given case Statement

Background:
      Given Launch "FireFox" Browser and load Url
         |http://automationpractice.com|
    
@sc1
	Scenario: This scenario is to validate whethe User is able to register using a valid email address
    
	 When Verify 'Sign-in link' is available in 'My Store' page If Sig-in exist click on Sigin
	 Then In 'sign page'  Verify  'Create- Account header' is available or not
	 Then Verify 'Email address' is preasent under Create Account if present enter a valid Email-id if mailid exist should display error messege
	  |abcd@gmail.com|
	Then If Email-id entered is  valid and does not exist then create a new account by Clicking on Create Account  Button
	|revprasad123@gmail.com|
	Then Verify Create an Account Page has all fields and enter the details to create account
	|Mrs|Revathi|Lakshmi|revathi9|Revathi|prasad|TechMahendhra|Hitech city,phase 2,500081,TechMahendhra|Hitech city,phase 2,500081,TechMahendhra|Binghamton|13903|cucumber classes online|1234567890|8989334567|Hitech city|	
	Then Click on 'Register'  button   
      
      
      
 Scenario: While registering, if the email address is incorrect. User should see an error message
          When  Click on Sigin  menu and navigate to Create Account and enter invalid Emai-lid
          |123|
          | abc|
          |$abc|



@src2
Scenario: This scenario is to validate Summer Dresses uneder Dresses menu
     Given browser is launched and application url is loaded and maximized
     |http://automationpractice.com|
    When  Click on Dresses menu and check whether Summer Dresses is present uder Dresses menu
    Then On the Summer dresses page. Click on Sort By: Price and validate whether the product grid is arranged properly*/
    
    
    
    
    
    
    