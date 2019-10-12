package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleStaleElementReferenceException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver_32.exe");
		WebDriver driver=new FirefoxDriver();

	}

}
