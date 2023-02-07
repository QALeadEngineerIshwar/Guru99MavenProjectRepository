package BaseClassPackage2;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POMClassPackage1.Guru99AddNewCustomerPageModel;
import POMClassPackage1.Guru99LoginPage;
import POMClassPackage1.LogoutPageModel;

public class baseclass
{
	//1.logger class is taken 
	
	Logger log= Logger.getLogger("Guru99MavenProject");

	
	//2. web driver declared with public access specifier
	
	public WebDriver driver;
	
	
	//3.setup() method taken along with @BeforeMethod tag.
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babarao Kishan Mise\\eclipse-workspace\\Guru99MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.properties");						// browser opened
		log.info("Browser is opened");
		
		driver.manage().window().maximize();									// window maximize						
		log.info("window is maximized");
		
		driver.get("https://demo.guru99.com/V1/index.php");						// URL opened
		log.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		
//-------------------------------------------------------------------------------------------------
		// Note: we have to create object of pom class 
		// and call the login functionality methods(sendusername,sendpassword,clickonloginbutton)
		
		
		// for login functionality pom class object is created.
		Guru99LoginPage GLP = new Guru99LoginPage (driver);
		GLP.sendusername();
		log.info("username is entered");
		
		GLP.sendpassword();
		log.info("password is entered");
		
		GLP.clickonloginbutton();
		log.info("clicked on the login button");
		
		
//-------------------------------------------------------------------------------------------------
		
		// after login another test case pom class object is created.
		Guru99AddNewCustomerPageModel G99ANCPM = new Guru99AddNewCustomerPageModel (driver);
		G99ANCPM.addcustomername("John Smith");
		G99ANCPM.clickaddcustomer();
		G99ANCPM.clickgender();
		G99ANCPM.customeraddress("Pune");
		G99ANCPM.customercity("Pune");
		G99ANCPM.customerdob("12", "03", "1992");
		G99ANCPM.customeremail("johnsmith@gmail.com");
		G99ANCPM.customerstate("maharashtra");
		G99ANCPM.customerpincode("413518");
		G99ANCPM.customermobile("9823154879");
		G99ANCPM.submitbtn();
		
		
// after login logout page model will work
		
		LogoutPageModel LPM = new LogoutPageModel(driver);
		LPM.logout();
		
		
		
			
	
	}
	
	
	
	
	//4. tearDown() method is taken along with @AfterMethod tag
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			log.info("quit form the current browser tab");
		}
	
	
	
	
	

}
