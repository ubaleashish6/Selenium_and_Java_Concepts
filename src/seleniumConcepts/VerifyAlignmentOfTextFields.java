package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyAlignmentOfTextFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement uName_TextField=driver.findElement(By.id("email"));
		int uName_X=uName_TextField.getLocation().getX();
		int uName_Y=uName_TextField.getLocation().getY();
		int uname_hieght=uName_TextField.getSize().height;
		int uname_width=uName_TextField.getSize().width;
		
		System.out.println("X = "+uName_X + ", Y = "+uName_Y+", Hight = "+uname_hieght+", Width = "+uname_width);
		
		System.out.println("id="+uName_TextField.getAttribute("id"));
		System.out.println("class="+uName_TextField.getAttribute("class"));
		System.out.println("name="+uName_TextField.getAttribute("name"));
		System.out.println("value="+uName_TextField.getAttribute("value"));
		System.out.println("type="+uName_TextField.getAttribute("type"));

	}

}
