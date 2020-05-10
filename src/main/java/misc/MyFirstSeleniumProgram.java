package misc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Started");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//New chrome browser window is opned
		WebDriver driver = new ChromeDriver();

		//This will maximize window size
		driver.manage().window().maximize();

		driver.get("http://demoqa.com/tooltip/");
		Actions actions = new Actions(driver);

		WebElement contextElement = driver.findElement(By.id("age"));
		
		actions.contextClick(contextElement).build().perform();
		Thread.sleep(4000);
		
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();


		System.out.println("Done");

	}

}
