package testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void befTestMethod() {
		System.out.println("=====================I am before method=====================");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	

	
	@Parameters({"SearchTerm"})
	@Test
	public void addToCartTest(String searchTerm) throws InterruptedException{
		
		System.out.println("Starting Test method execution");
		
		driver.get("https://www.amazon.co.uk/");
		System.out.println("Page Title : " + driver.getTitle());
		
		WebElement searchBoxEle = driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxEle.sendKeys(searchTerm);

		//searchBoxEle.sendKeys("RockDove Men's Two-Tone Lightweight Slip-On with Memory Foam");
		
		WebElement searchButtonEle = driver.findElement(By.xpath("//input[@value='Go']"));
		searchButtonEle.click();
		
		WebElement  firstShoeEle = driver.findElement(By.xpath("//img[@srcset=\"https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX200_SY161_QL70_.jpg 1x,https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX400_SY322_QL70_.jpg 2x,https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX600_SY483_QL70_.jpg 3x\"]"));
		firstShoeEle.click();
		
		
		WebElement sizeSelectEle = driver.findElement(By.name("dropdown_selected_size_name"));
		Select sizeSelectionDropdown = new Select(sizeSelectEle);
		//sizeSelectionDropdown.selectByValue("2,B0719Q2V92");
		sizeSelectionDropdown.selectByIndex(3);
		
		Thread.sleep(3000);
		
		WebElement addToCartEle = driver.findElement(By.id("add-to-cart-button"));
		addToCartEle.click();
		
		WebElement cartEle = driver.findElement(By.id("nav-cart-count"));
		String actualNumberOfElementsIncart = cartEle.getText();
		String expectedNumberOfElementsInCart = "1";
		
		
		Assert.assertEquals(actualNumberOfElementsIncart, expectedNumberOfElementsInCart,"Expected Number of Items in cart should be 1");
	}
	
	
	@AfterMethod
	public void afTestMethod() {
		System.out.println("=====================I am after method=====================");
		driver.quit();
		System.out.println("Closed browser window");
	}
	

}
