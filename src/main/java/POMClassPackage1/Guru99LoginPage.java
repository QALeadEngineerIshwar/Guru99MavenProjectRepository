package POMClassPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage 
{
	
	
	//1. declaration of the web driver
	
	WebDriver driver;
	
	//2. locating the web element using FindBy annotation
	
	@FindBy(xpath="//input[@name=\"uid\"]") WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement password;
	@FindBy(xpath="//input[@name=\"btnLogin\"]") WebElement loginbutton;
	
	
	//3. method creation to send the user name,password,and click on login button.
	
	public void sendusername()
	{
		username.sendKeys("mngr457054");
	}
	
	public void sendpassword()
	{
		password.sendKeys("atasAdy");
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}
	
	
	//4. constructor created to initialize the web elements.(u-name,pwd etc)
	
	
	public Guru99LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
