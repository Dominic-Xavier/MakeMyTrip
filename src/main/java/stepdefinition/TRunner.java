package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "@target/rerun.txt",
	plugin = {"html:target/cucumber-reports/cucumberhtmlreport.html","json:target/cucumber-reports/cucumberJsonReport.json"},
	monochrome = true
)

public class TRunner extends AbstractTestNGCucumberTests{
	
}
