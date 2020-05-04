package siva;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogInFaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com/");
		//Email text field 
		WebElement emailElement=driver.findElement(By.id("email"));
		emailElement.sendKeys("sankarqa9@gmail.com");
		//password text field 
		WebElement passElement =driver.findElement(By.id("pass"));
		passElement.sendKeys("Mkuk@789");
		
		WebElement loginButton=driver.findElement(By.id("u_0_b"));
		loginButton.click();
		
		Thread.sleep(5000);
		WebElement Dropdown=driver.findElement(By.id("userNavigationLabel"));
		Dropdown.click();
		
		Thread.sleep(3000);
		/*
		 * WebElement
		 * logoutButton=driver.findElement(By.xpath("//form[@class='_w0d _w0d']"));
		 * logoutButton.click();
		 */
		driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
		
		
		
		

	}

}
