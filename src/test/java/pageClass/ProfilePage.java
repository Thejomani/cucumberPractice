package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	WebDriver driver;
	@FindBy(xpath="//span[text()='thejomanibavanasi']")
	WebElement text;
	
	
	ProfilePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String printText() {
		return text.getText();
		
	}

}
