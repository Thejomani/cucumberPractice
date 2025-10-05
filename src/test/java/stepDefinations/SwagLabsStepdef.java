package stepDefinations;

import org.openqa.selenium.Alert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.BaseTest;
import pageClass.SwagLabLogin;

public class SwagLabsStepdef extends BaseTest{
	
	SwagLabLogin swagLabLogin;
	
	@Given("user is on Swag labs login page")
	public void user_is_on_swag_labs_login_page() {
		
		driver.get("https://www.saucedemo.com/");
		swagLabLogin=new SwagLabLogin(driver);
	}

	@When("^user gives valid (.*) and (.*)$")
	public void user_gives_valid_username_and_password(String username, String password) {
	    swagLabLogin.enterUserName(username);
	    swagLabLogin.enterPassword(password);
	}


	@And("click on login button in swag labs")
	public void click_on_login_button_in_swag_labs() {
		swagLabLogin.ClickOnButton();
	}

	@Then("user should  navigate to application home page")
	public void user_should_navigate_to_application_home_page() {
		try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Popup text: " + alert.getText());
            alert.accept(); // Click OK
        } catch (Exception e) {
            System.out.println("No alert popup detected.");
        }
	    System.out.println(driver.getTitle());
	}


}
