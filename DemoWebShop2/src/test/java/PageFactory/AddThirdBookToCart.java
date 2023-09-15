package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddThirdBookToCart {
	WebDriver driver;
 

@Given("I navigate to the URL {string}")
public void i_navigate_to_the_url(String string) {
	driver.get("http://demowebshop.tricentis.com");
    
}

@When("I click on the book")
public void i_click_on_the_book() {
	WebElement bookLink = driver.findElement(By.linkText("Book Title")); // Replace with the actual book title or selector
    bookLink.click();
}

@When("I add the third book to the cart")
public void i_add_the_third_book_to_the_cart() {
	WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-3")); // Replace with the actual button selector
    addToCartButton.click();
}


@Then("I should see a confirmation that the book was added to the cart")
public void i_should_see_a_confirmation_that_the_book_was_added_to_the_cart() {
    WebElement confirmation = null;
	if (confirmation.getText().contains("The product has been added to your shopping cart")) {
        System.out.println("Book was successfully added to the cart.");
    } else {
        System.out.println("Failed to add the book to the cart.");
    }
} 
}    


  


