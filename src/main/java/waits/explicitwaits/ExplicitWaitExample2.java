package waits.explicitwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tell the system where your chromedriver.exe is located
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement timingAlertExample = driver.findElement(By.id("timingAlert"));
		timingAlertExample.click();
		
		WebDriverWait explicitWait1 = new WebDriverWait(driver, 1);
		
		Alert timimgAlert = explicitWait1.until(ExpectedConditions.alertIsPresent());
		
		//Alert timimgAlert = driver.switchTo().alert();
		
		System.out.println(timimgAlert.getText());
		
		timimgAlert.dismiss();
		
	}

}
