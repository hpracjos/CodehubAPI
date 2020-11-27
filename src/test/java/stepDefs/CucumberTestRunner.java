package stepDefs;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/Feature/",
        glue = {"src/test/java/stepDefs"},
        monochrome = true,
        strict = true
)


public class CucumberTestRunner {
}
