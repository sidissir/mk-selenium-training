package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
	

}
