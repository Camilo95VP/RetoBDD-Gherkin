package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SolicitarCredito.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/ReporteSolicitarCredito", "json:target/SolicitarCreditoRunner.json"})
public class SolicitarCreditoRunner {
}
