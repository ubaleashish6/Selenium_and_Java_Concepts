package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Personal/Selenium/HTML%20Pages/Page2.html");
		//switching to frame by using Index...........
	/*	driver.switchTo().frame(1);
		driver.findElement(By.id("t2")).sendKeys("test");
		System.out.println("Elemented located present in frame....");
		driver.switchTo().defaultContent();
		//switching to frame by using ID...........
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("test");
		System.out.println("Elemented located present in frame....");
		driver.switchTo().defaultContent();
		//switching to frame by using Name...........
		driver.switchTo().frame("n2");
		driver.findElement(By.id("t2")).clear();
		driver.findElement(By.id("t2")).sendKeys("selenium");
		System.out.println("Elemented located present in frame....");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t3")).clear();
		driver.findElement(By.id("t3")).sendKeys("selenium");
		driver.findElement(By.id("t4")).clear();
		driver.findElement(By.id("t4")).sendKeys("selenium");*/
		
		WebElement frame_1=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(frame_1);
		driver.findElement(By.id("t1")).sendKeys("test");

	}

}
