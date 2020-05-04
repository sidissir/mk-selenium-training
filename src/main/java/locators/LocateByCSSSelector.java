package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSSelector {

	public static void main(String[] args) {

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
				WebElement emailElement = driver.findElement(By.cssSelector("#email"));
				
				emailElement.sendKeys("MyEmailID");
		
	}

}
