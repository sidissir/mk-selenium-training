package siva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDropDownList {
	WebDriver driver;
	Actions myActions;

	@BeforeMethod
	public void bfMethod() {
		System.out.println("=====================I am before method=====================");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}

	@Test
	public void dropDownList() {

		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		System.out.println(driver.getTitle());
		WebElement inputformelement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a"));
		inputformelement.click();
		WebElement selectdropdownelement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[4]/a"));
		selectdropdownelement.click();
		Select dropdownElement = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		dropdownElement.selectByVisibleText("Tuesday");

		// To perform CONTROL + a action
		WebElement multiselectElement = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		myActions.moveToElement(multiselectElement).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
				.perform();

		WebElement getallSelectElement = driver.findElement(By.xpath("//*[@id=\"printAll\"]"));

		getallSelectElement.click();
	}

	@AfterMethod
	public void afTestMethod() {
		System.out.println("=====================I am after method=====================");
		// driver.quit();
		System.out.println("Closed browser window");
	}

}
