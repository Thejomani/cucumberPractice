package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue={"stepDefinations","HooksConcept"},features="/src/test/resources/feature",
monochrome=true,
plugin= {"pretty","html:target/reports1.html",
		"json:target/TestNGReports/report.json"
		
})

public class ShopperRRunner extends AbstractTestNGCucumberTests {

	
}
