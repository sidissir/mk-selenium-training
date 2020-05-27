package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinitions" },plugin = {"html:target/CucReports/" ,"json:target/CucReports/CucJson.json"})
public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
