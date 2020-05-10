package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		// Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is
		// interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can
		// create object as shown below
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		Actions myActions = new Actions(driver);

		driver.get("https://www.facebook.com/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement emailEle = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement firstNameEle = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		
		
		//emailEle.sendKeys("Sachin"); => This one is preferred
		myActions.sendKeys("sehwag").perform();
		
		// To perform CONTROL + a action
		myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		// To perform CONTROL + x action
		myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
		
		// To perform CONTROL + v action
		myActions.moveToElement(firstNameEle).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		
		//myActions.moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).moveToElement(emailEle).click().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).moveToElement(firstNameEle).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		System.out.println("Done");
		
		
	}

}
