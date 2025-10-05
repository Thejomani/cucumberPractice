package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="username")
	WebElement userNameTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;


public LoginPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void user(String email) {
	userNameTxt.sendKeys(email);
}
public void pass(String password) {
	passwordTxt.sendKeys(password);
}
public WelcomePage click() {
	button.click();
	return new WelcomePage(driver);
}
}
