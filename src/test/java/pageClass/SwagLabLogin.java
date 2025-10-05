package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogin {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement userNameTxt;
	
	@FindBy(id="password")
	WebElement passwordTxt;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	public SwagLabLogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String username) {
		userNameTxt.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTxt.sendKeys(password);
	}
	
	public void ClickOnButton() {
		loginButton.click();
	}
	
}
