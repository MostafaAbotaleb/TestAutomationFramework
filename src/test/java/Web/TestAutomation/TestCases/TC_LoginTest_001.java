package Web.TestAutomation.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Web.TestAutomation.PageObjects.ChangLanguageCurrency;
import Web.TestAutomation.PageObjects.HomePage;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest() throws InterruptedException, IOException
	{
		
		System.out.println(driver.getTitle());
		logger.info("URL is obened");
		
		
		HomePage hp=new HomePage(driver);
		
	    hp.clickLogin();
	    
	    hp.setUsername(username);
	    
	  //  hp.clickNext();
	    
	    hp.setPassword(password);
	    
	    //hp.clickNext();
	    
	    if(driver.getTitle().equals("Anmelden – Google Konten"))
		{
			Assert.assertTrue(true);
			logger.info("Login was successful");
		}
		
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.warn("Login was failed");
				
		}
	    System.out.println(driver.getTitle());
	   
	}
		
}
