package mouseandkbactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		Thread.sleep(5000);
		
		WebElement sourceEle = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/span[1]"));
		WebElement targetEle = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div"));
		
		Actions myActions = new Actions(driver);
		//myActions.dragAndDrop(sourceEle, targetEle).build().perform();
		
		myActions.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();

		
		System.out.println("Done");
	}

}
