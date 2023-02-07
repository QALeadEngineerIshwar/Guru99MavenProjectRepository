package POMClassPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99AddNewCustomerPageModel 
{
	//1. web driver declared.
	
	WebDriver driver;
	
	//2.@FindBy annotation used to locate the web element.
	
	// for login activity so previous page pom class login code copied here with its method.
	
		@FindBy(xpath="//input[@name=\"uid\"]") WebElement username;
		@FindBy(xpath="//input[@name=\"password\"]") WebElement password;
		@FindBy(xpath="//input[@name=\"btnLogin\"]") WebElement loginbutton;
	
	
	@FindBy(xpath="//a[contains (text(),'New Customer')]") WebElement addnewcustomer;
	
	@FindBy(xpath="//input[@name=\"name\"]") WebElement customername;
	
	@FindBy(xpath="(//input[@name=\"rad1\"])[1]") WebElement gender;
	
	@FindBy(id="dob") WebElement DOB;          // we can use attribute name= attribute value
	
	@FindBy(name="addr") WebElement address;
	
	@FindBy(name="city") WebElement city;
	
	@FindBy(name="state") WebElement state;
	
	@FindBy(name="pinno") WebElement pincode;
	
	@FindBy(name="telephoneno") WebElement mobile;
	
	@FindBy(name="emailid") WebElement email;
	
	@FindBy(xpath="//input[@name=\"sub\"]") WebElement submitbutton;
	
	
	
	//3. method creation
	
	
	// for login code previous pom class method created here
	
	
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
	
	
	
	
	
	
	
	
	public void clickaddcustomer()
	{
		addnewcustomer.click();
		
	}
	
	public void addcustomername(String cname)
	{
		customername.sendKeys(cname);
	}
	
	
	public void clickgender()
	{
		gender.click();
	}
	
	
	public void customerdob(String DD, String MM, String YY)
	{
		DOB.sendKeys(DD);
		DOB.sendKeys(MM);
		DOB.sendKeys(YY);
		
	}
	
	public void customeraddress(String caddress)
	{
		address.sendKeys(caddress);
		
	}
	
	public void customercity(String ccity)
	{
		city.sendKeys(ccity);
	}
	
	public void customerstate(String cstate)
	{
		state.sendKeys(cstate);
	}
	
	public void customerpincode(String cpincode)
	{
		pincode.sendKeys(cpincode);
	}
	
	public void customermobile(String cmobile)
	{
		mobile.sendKeys(cmobile);
		
	}
	
	public void customeremail(String cemail)
	{
		email.sendKeys(cemail);
	}
	
	
	public void submitbtn()
	{
		submitbutton.click();
	}
	
	
	
	
	
	
	
	
	//4. constructor is created.
	
	
	public Guru99AddNewCustomerPageModel(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	

}
