package elementinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownInteractions {

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
				
				//Interactions on Select Drop down
				// tag name for dropdown element is select
				
				//Step 1: Locate Element
				WebElement monthDropdownElement  = driver.findElement(By.xpath("//select[@id='month']"));

				// Step 2: 
				Select monthSelection = new Select(monthDropdownElement);
				
				// Step 3
				monthSelection.selectByIndex(3);
				monthSelection.selectByValue("10");
				monthSelection.selectByVisibleText("Dec");
				
	}

}
