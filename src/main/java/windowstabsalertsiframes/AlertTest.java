package windowstabsalertsiframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

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

		driver.get("http://www.seleniumframework.com/Practiceform/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		WebElement alertButtonEle = driver.findElement(By.id("alert"));
		alertButtonEle.click();

		System.out.println("Alert is shown but not yet acknowledged");
		
		Alert alertObj = driver.switchTo().alert();
		System.out.println("Text Present in alert is : " + alertObj.getText());
		//alertObj.accept();
		alertObj.dismiss();
		//alertObj.sendKeys("Test data to eneter into alert box");
		
		// Any further actions after handling alert
		
		WebElement newbrowserWindowElement = driver.findElement(By.id("button1"));
		newbrowserWindowElement.click();

	}

}
