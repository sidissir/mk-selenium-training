package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// Tell the system where your chromedriver.exe is located
				System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

				// Open new chrome browser window
				// We can not directly create object for WebDriver because WebDriver is
				// interface
				// ChromeDriver is a class which implements WebDriver interface ,So we can
				// create object as shown below
				WebDriver driver = new ChromeDriver();
				// WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();

				driver.get("http://www.seleniumframework.com/Practiceform/");

				String pageTitle = driver.getTitle();
				System.out.println(pageTitle);
				
				
				Thread.sleep(5000);
				
				WebElement sourceEle = driver.findElement(By.id("draga"));
				WebElement targetEle = driver.findElement(By.id("dragb"));
				
				Actions myActions = new Actions(driver);
				myActions.dragAndDrop(sourceEle, targetEle).perform();
				
				//myActions.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
				
				
				System.out.println("Done");
				
				


	}

}
