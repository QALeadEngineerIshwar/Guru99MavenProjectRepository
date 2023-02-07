package POMClassPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageModel 
{
	
	
	//1.
	WebDriver driver;
	
	//2.
	@FindBy(xpath="//a[contains(text(),'Log out')]") WebElement logoutbutton;
	
	
	//3. 
	
	public void logout()
	{
		logoutbutton.click();
	}
	
	//4.
	
	
	 public LogoutPageModel (WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }

}
