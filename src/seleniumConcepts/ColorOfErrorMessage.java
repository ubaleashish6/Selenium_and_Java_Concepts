package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class ColorOfErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("btnLogin")).click();
		WebElement errorElement=driver.findElement(By.xpath("//*[@id='spanMessage']"));
		String errorText=errorElement.getText();
		System.out.println("Error message: "+errorText);
		
		String errorMessageTextColor=errorElement.getCssValue("color");
		System.out.println(errorMessageTextColor);
		String hexColor=Color.fromString(errorMessageTextColor).asHex();
		System.out.println(hexColor);

	}

}
