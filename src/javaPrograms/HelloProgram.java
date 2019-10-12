package javaPrograms;

import java.io.File;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Hello Program....");
		WebDriver driver=new FirefoxDriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		

	}

}
