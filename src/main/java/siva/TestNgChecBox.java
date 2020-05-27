package siva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgChecBox {

	WebDriver driver;

	@BeforeMethod
	public void befTestMethod() {
		System.out.println("=====================I am before method=====================");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}

	@Test
	public void checkbox() {
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.getTitle();
		WebElement inputformelement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a"));
		inputformelement.click();

		WebElement checkBoxDemoElement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a"));
		checkBoxDemoElement.click();

		WebElement singleCheckBoxElement = driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));

		singleCheckBoxElement.click();
		WebElement option3Element = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
		option3Element.click();
		WebElement checkAllElement = driver.findElement(By.xpath("//*[@id=\"check1\"]"));
		checkAllElement.click();
		WebElement uncheckallElement = driver.findElement(By.xpath("//*[@id=\"check1\"]"));
		uncheckallElement.click();
		
			
	}
	@AfterMethod
	public void afTestMethod() {
		System.out.println("=====================I am after method=====================");
		//driver.quit();
		System.out.println("Closed browser window");
	}

}
