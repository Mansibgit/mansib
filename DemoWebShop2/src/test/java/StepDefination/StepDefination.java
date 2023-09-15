package StepDefination;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.BaseTest;

import PageFactory.HomePage;


import PageFactory.ThirdBook;
import PageFactory.VerifyThirdBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class StepDefination  {
	WebDriver driver;
	
	@Given("a user is on the landing page of demowrbshop")
	public void a_user_is_on_the_landing_page_of_demowrbshop() {
driver = new ChromeDriver();
driver.manage().window().maximize();		

driver.get("https://demowebshop.tricentis.com/");

		
		
	}

	@When("he clicks on books in the navigation bar")
	public void he_clicks_on_books_in_the_navigation_bar() {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	}


	@When("Again clicks on books in the navigation bar")
	public void again_clicks_on_books_in_the_navigation_bar() {
		HomePage homepage = new HomePage(driver);
	    homepage.clickBooks();
	}

	@When("he clicks on the thirdbook")
	public void he_clicks_on_the_thirdbook() {
	    ThirdBook thirdbook = new ThirdBook(driver);
	    thirdbook.clickBook3();
	}

	@When("he verify the {string} button in third book")
	public void he_verify_the_button_in_third_book(String string) {
	    VerifyThirdBook verifythirdbook = new VerifyThirdBook(driver);
	    verifythirdbook.verifyBook3();
	    WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-45")); // Adjust the locator as needed
        assertTrue(addToCartButton.isDisplayed());
	    
	    
	}

	@Then("confirm all the books having \"AddToCart\"button")
	public void confirm_all_the_books_having_add_to_cart_button() {
	   
	}
}