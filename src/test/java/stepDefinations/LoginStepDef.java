package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.BaseTest;
import pageClass.LoginPage;

 public class LoginStepDef extends BaseTest{
	
	 LoginPage loginpage; 
	
//	public LoginStepDef() {
//		super();
//	}
	
	//LoginStepDef lsd= new LoginStepDef();
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  driver.get("https://www.instagram.com/");
	  loginpage=new LoginPage(driver);
	  System.out.println("url launched");
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		loginpage.user(username);
		loginpage.pass(password);
		System.out.println("entered valid credentials"); 
	}
	@When("click on login button")
	public void click_on_login_button() {
		loginpage.click();
		System.out.println("click action performed");
	    
	}
	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("in home page");
	    
	}
	

}
