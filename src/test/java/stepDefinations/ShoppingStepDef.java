package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.HooksConcept;

public class ShoppingStepDef {

    @Given("User is login to the application")
    public void user_is_login_to_the_application() {
        HooksConcept.driver.findElement(By.id("Email")).sendKeys("manimani@gmail.com");
        HooksConcept.driver.findElement(By.id("Password")).sendKeys("Qer*9876"); 
        HooksConcept.driver.findElement(By.xpath("//span[text()='Login']")).click();
    }

    @When("user search for {string}")
    public void user_search_for(String product) {
        HooksConcept.driver.findElement(By.id("search")).sendKeys(product);
        HooksConcept.driver.findElement(By.name("searchBtn")).click();
    }

    @And("add mobile to the cart")
    public void add_mobile_to_the_cart() {
//        // click on first product's "Add to Cart"
//        WebElement addToCart = HooksConcept.driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[1]"));
//        addToCart.click();
    }

    @Then("mobile  should be in cart")
    public void mobile_should_be_in_cart() {
        
//        HooksConcept.driver.findElement(By.id("cartIcon")).click();
//        WebElement cartItem = HooksConcept.driver.findElement(By.xpath("//div[contains(text(),'Mobile')]"));
//        Assert.assertTrue(cartItem.isDisplayed(), "Mobile was not added to the cart!");
    }

    @When("user navigate to the cart")
    public void user_navigate_to_the_cart() {
        HooksConcept.driver.findElement(By.id("cartIcon")).click();
    }

    @And("remove the mobile from the cart")
    public void remove_the_mobile_from_the_cart() {
        HooksConcept.driver.findElement(By.xpath("//button[@type='button']")).click();
    }

    @Then("mobile should not be in cart")
    public void mobile_should_not_be_in_cart() {
//        boolean itemPresent = HooksConcept.driver.findElements(By.xpath("//div[contains(text(),'Mobile')]")).size() > 0;
//        Assert.assertFalse(itemPresent, "Mobile is still present in the cart!");
    }
}
