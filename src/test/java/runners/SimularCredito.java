package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/SimularCredito.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/ReporteSimularCredito", "json:target/SimularCreditoRunner.json"})
public class SimularCredito {
}
