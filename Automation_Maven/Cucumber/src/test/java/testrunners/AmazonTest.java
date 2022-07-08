package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\Ishani\\Desktop\\Automation_Maven\\Cucumber" +
                "\\src\\main\\resources\\AppFeatures\\Search.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty"}
)


public class AmazonTest {
}
