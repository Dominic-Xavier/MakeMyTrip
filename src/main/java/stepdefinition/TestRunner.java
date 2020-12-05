package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	features = {"C:\\Users\\91960\\git\\repository4\\makeMytrip\\src\\main\\java\\features"},
	glue = {"implementation"},
	monochrome = true,
	dryRun = false,
	publish = true,
	plugin = {"html:target/cucumber-reports/cucumberhtmlreport.html",
			"json:target/cucumber-reports/cucumberJsonReport.json","rerun:target/rerun.txt"
			,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
