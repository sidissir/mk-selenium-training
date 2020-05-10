package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseContextClick {

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

		driver.get("https://www.toolsqa.com/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement tutorialMenuElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[2]/a/span/span"));
		
		myActions.contextClick(tutorialMenuElement).build().perform();
	}

}
