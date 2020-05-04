package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements {

	public static void main(String[] args) {

		//Tell the system where your chromedriver.exe is located
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		
		//Open new chrome browser window
		// We can not directly create object for WebDriver because WebDriver is interface
		// ChromeDriver is a class which implements WebDriver interface ,So we can create object as shown below
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//Example 1
		// I want all those links which have the term policy in link text
		List<WebElement> linkElementsList = driver.findElements(By.partialLinkText("Policy"));
		int numberOfMatchedLinks = linkElementsList.size();
		System.out.println("Number of Links With Policy" +numberOfMatchedLinks);
		
		
		
		//Example 2
		
		//I want to capture all the links present in a web page
		//We know that link has a tag
		
		List<WebElement> allLinksList = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links : " + allLinksList.size());
		
		for( WebElement eachLinkElement: allLinksList) {
			String hrefValue = eachLinkElement.getAttribute("href");
			
			System.out.println(hrefValue);
		}
		
		
		
		
		
		
		
	}

}
