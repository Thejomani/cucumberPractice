package pageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest extends Object {
	protected static WebDriver driver;
	     public BaseTest(){
	    	 super();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
