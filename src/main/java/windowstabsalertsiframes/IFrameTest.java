package windowstabsalertsiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		// Tell the system where your chromedriver.exe is located
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		// Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is
		// interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can
		// create object as shown below
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/iframe-practice-page/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		
		//Switching to an IFrame using Index
		driver.switchTo().frame(0);
		//Switching to IFrame using name
		//driver.switchTo().frame("iframe1");
		
		//Swithcing to Iframe using id
		//driver.switchTo().frame("IF1");
		
		//Swithcing to Iframe using IFrame element
		WebElement iframe1Ele = driver.findElement(By.id("IF1"));
		driver.switchTo().frame(iframe1Ele);
		
		
		
		System.out.println("After Switching ===========================");
		
		//After switining to any IFrame, we can locate and perform actions inside that iframe only and not even in parent page
		WebElement linkElementInsideIFrame = driver.findElement(By.linkText("Software Testing Tutorial"));
		linkElementInsideIFrame.click();
		
		driver.switchTo().defaultContent();
		
		WebElement linkElementInsideParentPage = driver.findElement(By.linkText("Sortable"));
		linkElementInsideParentPage.click();
		
		
		
	}

}
