package pageClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksConcept {
	public static WebDriver driver;
	@Before
	public void setUp() {
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://shoppersstack.com/user-signin");
	}
	@After
	public void tearDown() {
		if(driver !=null) {
		driver.close();
		}
		
	}
}
