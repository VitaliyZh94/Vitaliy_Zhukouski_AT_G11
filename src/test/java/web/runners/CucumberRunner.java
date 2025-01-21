package web.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"web"},
        features = {"src/test/resources/features/jotform/CheckFormCreated.feature"},
        tags = "@QA"
)
public class CucumberRunner {
}

