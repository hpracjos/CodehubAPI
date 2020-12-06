package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/appFeatures/getGreetings.feature"},
        glue = {"stepDefinations"},
        plugin = {"pretty"},
        strict = true
)
public class greetingsTestRunner {
}
