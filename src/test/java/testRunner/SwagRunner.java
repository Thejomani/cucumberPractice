package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue="stepDefinations",features="/src/test/resources/SwagLabsFeature",
monochrome=true,
plugin= {"pretty","html:target/reports.html",
		"json:target/TestNGReports/report.json"
		
}

)
public class SwagRunner {

}
