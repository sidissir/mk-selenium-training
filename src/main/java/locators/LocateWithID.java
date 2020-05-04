package locators;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class LocateWithID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tell the system where your chromedriver.exe is located
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		// Step 1 => Locate Element
		WebElement emailElement = driver.findElement(By.id("email"));
	    
		
		    
		
		if(emailElement!=null) {
			System.out.println("Email element found");
		}

		
		//Step 2: Perform action on element
		emailElement.sendKeys("My First name 123 @ !");

	}

}
