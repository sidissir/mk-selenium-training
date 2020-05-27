package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		//Before run window size 
		System.out.println("Window size =" + driver.getWindowHandles().size());
		
		WebElement newBrowserWindowElement = driver.findElement(By.id("button1"));
		newBrowserWindowElement.click();
		

//after run window size 
		System.out.println("Window size =" + driver.getWindowHandles().size());
		
		driver.quit();

	}

}
