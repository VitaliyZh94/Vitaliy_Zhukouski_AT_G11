package selenium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"selenium"},
        features = {"src/test/resources/features/booking/HeaderElement.feature"},
        tags = "@QA"
)
public class CucumberRunner {
}

