package seleniumConcepts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



public class TakeScreenShot1 {
	
	public WebDriver driver;

	
	@Test
	public void testCaseOne() {
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.co.in/");
		takeScreenShotOfPage(driver);
	}
	
	public void  takeScreenShotOfPage(WebDriver driver) {
		
		this.driver=driver;
		Date d=new Date();
		//SimpleDateFormat dform=d.
		String date1=d.toString();
		System.out.println(date1);
		String date2=date1.replaceAll(":", "_");
		System.out.println(date2);
		
		try {
			TakesScreenshot tr=((TakesScreenshot)driver);
			
			File srcFile=tr.getScreenshotAs(OutputType.FILE);
			File destFile=new File("C:\\Users\\ashish.ubale\\eclipse-workspace\\JavaAndSelenium\\src\\seleniumConcepts\\"+date2+"_googleHomePage.png");
			FileHandler.copy(srcFile, destFile);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
