package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {

		System.out.println("Started");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");

		WebDriver webDriver = new ChromeDriver();

		webDriver.manage().window().maximize();

		webDriver.get("https://www.facebook.com/");

		String pageTitle = webDriver.getTitle();
		System.out.println("Page Title is :" + pageTitle);
		
		WebElement firstnameEle = webDriver.findElement(By.name("firstname"));
		firstnameEle.sendKeys("fname1");
		
		
		WebElement lastnameEle = webDriver.findElement(By.name("lastname"));
		lastnameEle.sendKeys("lname1");

		WebElement emailEle = webDriver.findElement(By.name("reg_email__"));
		emailEle.sendKeys("testxyz@gmail.com");
		
		
		
		WebElement passwordEle = webDriver.findElement(By.name("reg_passwd__"));
		passwordEle.sendKeys("dontcopymypassword");
		
		
		WebElement dayDropdwonEle = webDriver.findElement(By.name("birthday_day"));
		Select daySlect = new Select(dayDropdwonEle);
		daySlect.selectByValue("10");
		
		WebElement monthDropdwonEle = webDriver.findElement(By.name("birthday_month"));
		Select monthSlect = new Select(monthDropdwonEle);
		monthSlect.selectByValue("7");
		
		WebElement yearDropdwonEle = webDriver.findElement(By.name("birthday_year"));
		Select yearSlect = new Select(yearDropdwonEle);
		yearSlect.selectByValue("1986");
		
		
		
		WebElement genderEle = webDriver.findElement(By.xpath("//input[@value='2']"));
		genderEle.click();
		
		WebElement submitEle = webDriver.findElement(By.name("websubmit"));

		submitEle.click();
		
		webDriver.quit();

		System.out.println("Completed");

	}

}
