
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/Features"},
        glue = {"com/cucumber/stepdefs"},
        tags = "@tag")
public class TestRunner extends AbstractTestNGCucumberTests {
}
