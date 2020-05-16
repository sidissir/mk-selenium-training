package waits.explicitwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExpectdConditionsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		WebElement firstnameElement = driver.findElement(By.name("firstname"));
		firstnameElement.sendKeys("firstname");
		
		
		WebElement surnameElement = driver.findElement(By.name("lastname"));
		surnameElement.sendKeys("surname");
		
		WebElement emailaddressElement = driver.findElement(By.name("reg_email__"));
		//emailaddressElement.sendKeys("sankarqa9@gmail.com");
		
		
		/*
		 * WebElement reenteremailaddressElement =
		 * driver.findElement(By.name("reg_email_confirmation__"));
		 * reenteremailaddressElement.sendKeys("sankarqa9@gmail.com");
		 */
		WebDriverWait explicitWait1 = new WebDriverWait(driver, 10);
		
		// Just waits until the element is present in HTML and doesn't bother whther its visible or not
		//WebElement reenteremailaddressElement = explicitWait1.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email_confirmation__")));
		
		// Not only waits until the element is present in HTML and also until the element is visible and doesn't bother whther its clickable/Editable or not
		//WebElement reenteremailaddressElement = explicitWait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__")));
		
		// Not only waits until the element is present in HTML and also until the element is visible and also untilthe element is clickable/Editable
		WebElement reenteremailaddressElement = explicitWait1.until(ExpectedConditions.elementToBeClickable(By.name("reg_email_confirmation__")));
		reenteremailaddressElement.sendKeys("sankarqa9@gmail.com");

		
		WebElement passwordElement = driver.findElement(By.name("reg_passwd__"));
		passwordElement.sendKeys("firstname");
		

		
		
		
	}

}
