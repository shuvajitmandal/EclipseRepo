package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
glue = {"StepDefinitions"},monochrome = true,
plugin = {"pretty","html:target/HtmlReports",
		"json:target/JsonReports/JsonReport.json",
		"junit:target/JunitReports/JunitReport.xml"})
//tags = "@SmokeFeature")
public class TestRunner {

}
