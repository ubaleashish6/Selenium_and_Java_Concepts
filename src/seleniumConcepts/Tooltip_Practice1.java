package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		String tooltipText=driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]")).getAttribute("title");
		System.out.println(tooltipText);

	}

}
