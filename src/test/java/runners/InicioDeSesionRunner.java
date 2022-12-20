package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/InicioDeSesion.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/ReporteInicioSesion", "json:target/InicioDeSesionRunner.json"})
public class InicioDeSesionRunner {

}
