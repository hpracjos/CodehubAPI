package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/getGreetings.feature",
        glue = "src.test.java.stepDefs"
)


public class CucumberTestRunner {
}
