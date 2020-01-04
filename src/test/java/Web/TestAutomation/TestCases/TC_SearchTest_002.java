package Web.TestAutomation.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Web.TestAutomation.PageObjects.HomePage;

public class TC_SearchTest_002 extends BaseClass
{

	@Test
	public void SearchTest() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.search();
		
		 if(driver.getTitle().equals("mohamed salah - Google-Suche"))
			{
				Assert.assertTrue(true);
				logger.info("Search was successful");
			}
			
			else
			{
				captureScreen(driver, "SearchTest");
				Assert.assertTrue(false);
				logger.warn("Search was failed");
					
			}
	}
	
}
