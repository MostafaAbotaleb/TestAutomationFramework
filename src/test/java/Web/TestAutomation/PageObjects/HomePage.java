package Web.TestAutomation.PageObjects;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

	WebDriver ldriver;
	 public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(xpath="//input[@class='button-1 login-button']")
	 WebElement loginButton;
	 
	 @FindBy(id="Email")
	 WebElement txtUsername;
	 
	 
	 @FindBy(id="Password")
	 WebElement txtPassword;
	 
	 
	 
	 
	 
	 
	 public void setUsername(String name)
	 {
		 txtUsername.sendKeys(name);
	 }
	 
	
	 
	 public void setPassword(String password)
	 {
		txtPassword.sendKeys(password);
	 }
	 
	 public void clickLogin()
	 {
	 loginButton.click();
	 }
	 
	  
	 
}
