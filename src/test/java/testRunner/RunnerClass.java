package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue="stepDefinations",features="src/test/resources/feature",
monochrome=true,
plugin= {"pretty","html:target/reports.html",
		"json:target/TestNGReports/report.json"
		
}

)
public class RunnerClass extends AbstractTestNGCucumberTests{
	

}
