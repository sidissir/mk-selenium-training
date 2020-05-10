package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		// Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is
		// interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can
		// create object as shown below
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		Actions myActions = new Actions(driver);

		driver.get("https://www.selenium.dev/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		try {
			WebElement dowloadEle = driver.findElement(By.xpath("//*[@id=\"1navbar\"]/a[1]"));

			dowloadEle.click();

			System.out.println(driver.getTitle());
		} catch (Exception e) {

			System.out
					.println("Exception occued because there is no Download link in the page. Hence taking screenshot");
			TakesScreenshot takeScreenshotObj = (TakesScreenshot) driver;
			File screenshotFile = takeScreenshotObj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("screenshots/screenshot2.png"));
			
			System.out.println("Done with taking screenshot");
		}

		System.out.println("Done");
		
		driver.quit();
	}

}
