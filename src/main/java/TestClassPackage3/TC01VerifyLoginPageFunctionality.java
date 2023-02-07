package TestClassPackage3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassPackage2.baseclass;

public class TC01VerifyLoginPageFunctionality extends baseclass
{
	//1.method created along with @Test annotations.
	
	@Test
	public void verifylogin() throws IOException
	{
		
		
		System.out.println("apply validation using the assertion");
		
		String ExpTitle = "GTPL Bank Manager HomePage";
		
		String ActualTitle = new String(driver.getTitle());
		
		Assert.assertEquals(ActualTitle, ExpTitle);
		
		UtilityClassPackage.ScreenshotClass.GetScreenshot(driver,ActualTitle);
		
		
	
		
		
		
		
	}
	
	
	
	
}
