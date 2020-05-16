package waits.implicitwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement dressesElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(dressesElement).build().perform();
		
		//Thread.sleep(15000);
		
		WebElement summerDressesElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
		//WebElement summerDressesElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/ul/li[4]/a"));

		
		summerDressesElement.click();
		
		
		
	}

}
