package elementstate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				//Check the state of element before performing action on element
				System.out.println("Displayed ? " + emailElement.isDisplayed());
				System.out.println("Enabled ? " + emailElement.isEnabled());
				//System.out.println("Selected ? " + emailElement.isSelected());
				
				// Step 2 => Act on the element
				emailElement.sendKeys("myemailid");
				System.out.println("-----------------------------------------------------------");

				
				//Check the state of element after performing action on element
				System.out.println("Displayed ? " + emailElement.isDisplayed());
				System.out.println("Enabled ? " + emailElement.isEnabled());
				//System.out.println("Selected ? " + emailElement.isSelected());
				
				System.out.println("==============================Now I am working with female radio button =======================");
				//Step 1 => Locate element
				WebElement femaleRadioElement= driver.findElement(By.xpath("//input[@value='1']"));
				
				//Check the state of element before performing action on element
				System.out.println("Displayed ? " + femaleRadioElement.isDisplayed());
				System.out.println("Enabled ? " + femaleRadioElement.isEnabled());
				System.out.println("Selected ? " + femaleRadioElement.isSelected());
				
				// Step 2 => Act on the element
				femaleRadioElement.click();
				System.out.println("-----------------------------------------------------------");

				
				//Check the state of element after performing action on element
				System.out.println("Displayed ? " + femaleRadioElement.isDisplayed());
				System.out.println("Enabled ? " + femaleRadioElement.isEnabled());
				System.out.println("Selected ? " + femaleRadioElement.isSelected());
				
				

				
	}

}
