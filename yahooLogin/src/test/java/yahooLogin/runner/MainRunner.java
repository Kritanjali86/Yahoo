package yahooLogin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/java/yahooLogin/feature" },
		glue = { "yahooLogin.stepDefination" },

		monochrome = true, tags = {},

		// plugin = {
		// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}

		// plugin = ("json:target/cucumber-reports/CucumberTestReport.json")

		// plugin
		// ={"pretty","html:target/cucumber","json:target/cucumber-reports/cucumber.json",

		// "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}

		//format = { "pretty", "html:test-output_1",
				//"json:target/cucumber-reports/CucumberTestReport.json" }, 
		//plugin = ("json:target/cucumber-reports/CucumberTestReport.json")

		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-reports/cucumber.json"}
)

public class MainRunner {

}
