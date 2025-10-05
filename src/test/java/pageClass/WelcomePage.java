package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;
	@FindBy(xpath = "//div[text()='Not now']")
	WebElement button;
	
	@FindBy(xpath="//img[contains(@alt,'thejomani')]")
	WebElement profile;
	
	
	
	WelcomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void security() {
		button.click();
		
	}
	public ProfilePage viewProfile() {
		 profile.click();
		 return new ProfilePage(driver);
	}
	


}