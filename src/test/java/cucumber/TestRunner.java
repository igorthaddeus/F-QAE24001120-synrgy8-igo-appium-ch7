package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome=true,
        tags = "@Login",
        plugin = "html:target/cucumber.html")
public class TestRunner extends AbstractTestNGCucumberTests {
}
