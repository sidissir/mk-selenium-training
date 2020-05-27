package siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InputFormSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions myActions = new Actions(driver);
		

		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement inputformelement = driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a"));
		
		inputformelement.click();
		
	 WebElement inpuformSubmitElement =  driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[5]/a"));
		
	 inpuformSubmitElement.click();
	    WebElement firstNameElement =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input"));
	    firstNameElement.sendKeys("Anusha");
	   WebElement lastName =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input"));
	   lastName.sendKeys("Lakkireddy");
	  WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input"));
	  emailElement.sendKeys("abcd23@gmail.com");
	  WebElement phoneElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input"));
	  phoneElement.sendKeys("1234567890");
	  WebElement addressElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input"));
	  addressElement.sendKeys("6,cagney cresent");
	  WebElement cityElement = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input"));
	  cityElement.sendKeys("MK");
	   

	   
	   
	}

}
