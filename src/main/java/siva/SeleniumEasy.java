package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumEasy {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		//driver.getWindowHandle();
		
		WebElement popupElement=  driver.findElement(By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]"));
		
		popupElement.click();
		
		//WebElement popup=driver.findElement(By.className("at-cv-button at-cv-lightbox-yesno at-cm-no-button"));
		/*
		 * WebElement popup=driver.findElement(By.tagName("@href=\"#\""));
		 * Thread.sleep(3000); popup.click();
		 */
		
		
		  WebElement textMessage=driver.findElement(By.id("user-message"));
		 
		  textMessage.sendKeys("Siva rocking selenium");
		 
		
		  WebElement button=driver.findElement(By.xpath( "/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")); 
		  button.click();
		  
		  WebElement valueElementa = driver.findElement(By.xpath("//*[@id=\"sum1\"]"));
		  valueElementa.sendKeys("2");
		  
		  WebElement valueElementb = driver.findElement(By.xpath("//*[@id=\"sum2\"]"));
		  valueElementb.sendKeys("3");
		  
		  WebElement button1 =driver.findElement(By.xpath( "//*[@id=\"gettotal\"]/button")); 
		  button1.click();
		  
		  
		  
		 
		
		

	}

} 
