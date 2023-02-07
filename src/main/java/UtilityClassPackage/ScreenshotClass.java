package UtilityClassPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass
{
	
	
	// method created to get screenshot and store into the project folder.
	
	public static void GetScreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		Date d = new Date();
		
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		
		String date =d1.format(d);
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Screenshots/Guru99MavenProject" + screenshotname + date + ".jpg" );
		
		FileHandler.copy(Source, destination);
		
		
	}

}
