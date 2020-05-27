package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCartSteps {
	WebDriver driver;

	@Given("I have opened browser")
	public void i_have_opened_browser() {
		System.out.println("=====================I am before method=====================");
		System.setProperty("webdriver.chrome.driver", "conf/browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}

	@When("I am on home page")
	public void i_am_on_home_page() {
		driver.get("https://www.amazon.co.uk/");
		System.out.println("Page Title : " + driver.getTitle());
	}

	@When("I search for {string}")
	public void i_search_for(String searchTerm) {
		WebElement searchBoxEle = driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxEle.sendKeys(searchTerm);

		WebElement searchButtonEle = driver.findElement(By.xpath("//input[@value='Go']"));
		searchButtonEle.click();
	}

	@When("I click on first product in results page")
	public void i_click_on_first_product_in_results_page() {
		WebElement  firstShoeEle = driver.findElement(By.xpath("//img[@srcset=\"https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX200_SY161_QL70_.jpg 1x,https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX400_SY322_QL70_.jpg 2x,https://m.media-amazon.com/images/I/71+pcFnaQmL._AC_SX600_SY483_QL70_.jpg 3x\"]"));

		firstShoeEle.click();
	}

	@When("I select required size in product page")
	public void i_select_required_size_in_product_page() throws InterruptedException {
		WebElement sizeSelectEle = driver.findElement(By.name("dropdown_selected_size_name"));
		Select sizeSelectionDropdown = new Select(sizeSelectEle);
		sizeSelectionDropdown.selectByIndex(3);
		
		Thread.sleep(3000);
	}

	@When("I add the product to basket from product page")
	public void i_add_the_product_to_basket_from_product_page() {
		WebElement addToCartEle = driver.findElement(By.id("add-to-cart-button"));
		addToCartEle.click();
	}

	@Then("cart should get updated with added item")
	public void cart_should_get_updated_with_added_item() {
		WebElement cartEle = driver.findElement(By.id("nav-cart-count"));
		String actualNumberOfElementsIncart = cartEle.getText();
		String expectedNumberOfElementsInCart = "1";
		
		
		Assert.assertEquals(actualNumberOfElementsIncart, expectedNumberOfElementsInCart,"Expected Number of Items in cart should be 1");
		driver.quit();
	}

}
