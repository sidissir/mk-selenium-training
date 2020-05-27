package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions myActions = new Actions(driver);

		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
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

}
