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
	 
	 @FindBy(id="gb_70")
	 WebElement loginButton;
	 
	 @FindBy(id="identifierId")
	 WebElement txtUsername;
	 
	 
	 @FindBy(name="password")
	 WebElement txtPassword;
	 
	 
	 @FindBy(name="q")
	 WebElement searchBox;
	 
	 public void clickLogin()
	 {
	 loginButton.click();
	 }
	 
	 public void setUsername(String name)
	 {
		 txtUsername.sendKeys(name,Keys.ENTER);
	 }
	 
	
	 
	 public void setPassword(String password)
	 {
		txtPassword.sendKeys(password,Keys.ENTER);
	 }
	 
	 public void search()
		{
		 searchBox.sendKeys("mohamed salah",Keys.ENTER);
		}
	 
	  
	 
}
