package seleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(5000);
		
		Set<String> childWindows=driver.getWindowHandles();
		int countOfWindows=childWindows.size();
		System.out.println(countOfWindows);
		Iterator<String> itr=childWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			System.out.println(childWindow);
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("ashishu");
			}
		}
		for(String window: childWindows) {
			String win=window;
			driver.switchTo().window(win);
			driver.findElement(By.name("emailid")).sendKeys("ashishu");
		}*/
		
		System.setProperty("webdriver.gecko.driver", "D:\\Personal\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));
		 
		for(int i = 0; i < 3; i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}
		 
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
			driver.switchTo().window(handle);
			System.out.println("Window handle - > " + handle);
			if(!parentWindowHandle.equalsIgnoreCase(handle)) {
				driver.close();
			}
		
			
		}
		driver.switchTo().window(parentWindowHandle);
		driver.close();
		System.out.println("Parent window has been closed...");
		
 
	}

}
