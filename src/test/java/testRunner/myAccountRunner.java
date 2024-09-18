package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/myAccount.feature",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:reports/myAccount_feature.html"}
)

public class myAccountRunner {

}
