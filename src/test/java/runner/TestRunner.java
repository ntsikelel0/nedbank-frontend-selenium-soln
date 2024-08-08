package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefs"},
        plugin = {"html:target/htmlCucumberReport.html"},
        tags ="@regression"

)
public class TestRunner extends AbstractTestNGCucumberTests {
}