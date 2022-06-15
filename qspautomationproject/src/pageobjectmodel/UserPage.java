package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage 
{
	
	////td[@class="cornerLeft"]  click on create user
	
	@FindBy(xpath="//input[@value=\"Create New User\"]") private WebElement createuser;
	@FindBy(xpath="//input[@name=\"username\"]") private WebElement username;
	@FindBy(xpath="//input[@name=\"passwordText\"]") private WebElement password;
	@FindBy(xpath="//input[@name=\"passwordTextRetype\"]") private WebElement retypepassword;
	@FindBy(xpath="//input[@name=\"firstName\"]") private WebElement firstname;
	@FindBy(xpath="//input[@name=\"lastName\"]") private WebElement lastname;
	@FindBy(xpath="//input[@name=\"overtimeTracking\"]") private WebElement overtimetracking;
	
	
	
	

}
