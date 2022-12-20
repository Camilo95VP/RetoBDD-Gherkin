package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/PagarCredito.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/ReportePagarCredito", "json:target/PagarCreditoRunner.json"})
public class PagarCreditoRunner {
}
