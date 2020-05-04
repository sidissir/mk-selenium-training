package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPATH {

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
		WebElement emailElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
	
		//Step 2 => Act on it
		emailElement.sendKeys("myemail");
		
		WebElement passElement  = driver.findElement(By.xpath("//*[@id='pass']"));
		
		passElement.sendKeys("mypassword");
	}

}
