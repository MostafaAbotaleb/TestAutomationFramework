package Web.TestAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ChangLanguageCurrency 
{
	WebDriver ldriver;
	 public ChangLanguageCurrency(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(id="culture-selector-locale")
	 WebElement LanguageBox;
	 
	 @FindBy(id="culture-selector-save")
	 WebElement saveButton;
	 
	 public void selectLanguageBox()
	 {
		 LanguageBox.click();
	 }
	 
	 public void clickSave()
	 {
		 saveButton.click();
	 }
	 
	 
	 
	 Select language = new Select(LanguageBox);
	 
	 public void englishLanguage()
	 {
		 language.deselectByIndex(0); 
	 }
	 
	 
	 
}
